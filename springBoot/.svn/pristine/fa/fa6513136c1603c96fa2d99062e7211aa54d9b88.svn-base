package com.jiashi.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.jiashi.domain.Clainm;
import com.jiashi.domain.DayCost;
import com.jiashi.domain.DayCostTal;
import com.jiashi.domain.Profit;
import com.jiashi.domain.Projects;
import com.jiashi.domain.Team;
import com.jiashi.service.ClaimnumService;
import com.jiashi.service.DayCostService;
import com.jiashi.service.ProjectsService;
import com.jiashi.service.TeamService;
import com.jiashi.util.JSONUtil;

/**
 * Created by bysocket on 19/04/2018.
 */
@RestController
public class JiaShiProjectsTotaController {
	@Autowired
	private DayCostService dayCostService;
	@Autowired
	private ProjectsService  projectsService;
	@Autowired
	private ClaimnumService claimnumService;
	@Autowired 
	private TeamService  teamService;
	//查询项目.月份的营业分布
	@RequestMapping(value = "selectProjectsTotal")
	public String findProTal(HttpServletRequest request,HttpServletResponse response) throws Exception {

		 List<Projects> selectProjectsto = projectsService.selectProjectsto();
		String Month = request.getParameter("Month");
		HashSet<Projects> hashSet = new HashSet<Projects>();
		HashSet<DayCostTal> hashSet1 = new HashSet<DayCostTal>();
		hashSet.clear();
		hashSet.addAll(selectProjectsto);
		System.out.println(hashSet.toString());
		//selectProjects.addAll(hashSet);
		List<DayCostTal> arrayList = new ArrayList<DayCostTal>();
		double i=0;
		if(hashSet!=null && !"".equals(hashSet)){
			for (Projects projects : hashSet) {
				DayCostTal dayCostTal = new DayCostTal();
				 // Projects jsonStringToObject2 = JSONUtil.jsonStringToObject(Projects.class, projects);
				String projectName = projects.getProjectName();
				i=0;
			   //根据项目名称查询人天信息
				List<Map> list = new ArrayList<Map>();
				List<DayCost> selectDayCostByProName = dayCostService.selectDayCostByProNameto(projectName,Month);
				if(selectDayCostByProName.size()>0){
					for (DayCost dayCost : selectDayCostByProName) {
						String dayCostUserName = dayCost.getDayCostUserName();
					    String dayCostByUserid = dayCostService.selectDayCostByUseridAndProName(dayCostUserName,projectName);
					    double dayCostOneCost = dayCost.getDayCostOneCost();
						double dayCostDayNum = dayCost.getDayCostDayNum();
						double totalCost=dayCostOneCost*dayCostDayNum;
						i +=totalCost;
						dayCostTal.setDayCostTotalCost(i);
						dayCostTal.setDayCostProject(projectName);
						arrayList.add(dayCostTal);
					}
				}
			}
		}
		hashSet1.addAll(arrayList);
		return JSONUtil.objectToJSONString(hashSet1);
		
	}	
	
	

	
	//查询项目的营业利润分布
	@RequestMapping(value = "selectProjectsTotalLR")
	public String findProTalL(HttpServletRequest request,HttpServletResponse response) throws Exception {
	List<Projects> selectProjectsto = projectsService.selectProjectsto();
		List<Profit> arrayList2 = new ArrayList<Profit>();
		String month = request.getParameter("Month");
		HashSet<Projects> hashSet = new HashSet<Projects>();
		hashSet.clear();
		hashSet.addAll(selectProjectsto);
		double i=0;
		double y=0;
		double z=0;
		double x=0;
		double c=0;
		if(hashSet!=null && !"".equals(hashSet)){
			for (Projects projects : hashSet) {
				DayCostTal dayCostTal = new DayCostTal();
				String projectName = projects.getProjectName();
				i=0;
				z=0;
				y=0;
				x=0;
				c=0;
				Profit profit2 = new Profit();
			   //根据项目名称查询人天信息
				List<DayCost> selectDayCostByProName = dayCostService.selectDayCostByProNameto(projectName,month);
				if(selectDayCostByProName.size()>0){
					for (DayCost dayCost : selectDayCostByProName) {
						String dayCostUserName = dayCost.getDayCostUserName();
					    DayCost dayCostByUserid = dayCostService.selectDayCostByUseridAndProNameto(dayCostUserName,projectName);
					    double dayCostOneCost = dayCostByUserid.getDayCostOneCost();
						double dayCostDayNum = dayCostByUserid.getDayCostDayNum();
						double dayCostTotalCost = dayCostByUserid.getDayCostTotalCost();
						double totalCost=dayCostOneCost*dayCostDayNum;
						z +=dayCostTotalCost;
						i +=totalCost;
				    //根据用户名称查询用户报销金额
				    List<Clainm> selectClaimnuByUserName = claimnumService.selectClaimnuByUserNameto(dayCostUserName, month);
				    if(selectClaimnuByUserName.size()>0){
				    	for (Clainm clainm : selectClaimnuByUserName) {
				    		double claimTotalCrash = clainm.getClaimTotalCrash();
				    		y +=claimTotalCrash;
				    		
						}
				
				    }
				    //查询团建费用
				    List<Team> selectTeamBuileByUserName = teamService.selectTeamBuileByUserNameto(dayCostUserName);
				    if(selectTeamBuileByUserName.size()>0){
				    	
				    	for (Team team : selectTeamBuileByUserName) {
							double tb_av_money = team.getTb_av_money();
				    		x +=tb_av_money;
						}
				    }
				    
				     BigDecimal bl = new BigDecimal(i);
					 BigDecimal b2 = new BigDecimal(y);
					 BigDecimal b3 = new BigDecimal(z);
					 BigDecimal b4 = new BigDecimal(x);
					 BigDecimal subtract = bl.subtract(b2);
					 BigDecimal profit = subtract.subtract(b3);
					 double doubleValue = profit.subtract(b4).doubleValue();
					 c +=doubleValue;
							  
				    }
					 profit2.setDayCostProject(projectName);
					 profit2.setProfit(c);
					 arrayList2.add(profit2);
				}
				
			}
			
		}
		
		
		return  JSONUtil.objectToJSONString(arrayList2);
		
	}	
	
	


	


} 
