package com.ngandy.repository;

import java.util.ArrayList;
import java.util.List;

import com.ngandy.model.Activity;
import com.ngandy.model.ActivitySearch;
import com.ngandy.model.User;
//This is how you would interact with the DB.
//Stub out our Database
public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findByConstraints(ActivitySearch search) {
		
		System.out.println(search.getDurationTo());
		System.out.println(search.getSearchType());
		
		List<Activity> activities = new ArrayList<>();
		
		Activity activity = new Activity();
		activity.setId("1234");
		activity.setDescription("Running");
		activity.setDuration(60);
		
		activities.add(activity);
		
		return activities;}
	
	@Override
	public List<Activity> findByDescription(List<String> descriptions, int durationFrom, int durationTo) {
		// select * from activty where descrpitions in (?,?) and duration > ? and duration < ?
		List<Activity> activities = new ArrayList<>();
		
		Activity activity = new Activity();
		activity.setId("1234");
		activity.setDescription("Running");
		activity.setDuration(60);
		
		activities.add(activity);
		
		return activities;
	}
	
	@Override
	public void create(Activity activity) {
			//should issue a insert statement to the db
	}
	

	@Override 
	public void delete (String activityId){
		//delete from activity where activityId = ?
		
	}
	
	@Override
		public Activity update(Activity activity) {
			// search the database to see if we have an activity with that id already
			// select * from activity where id = ?
			// if rs size == 0 
			// insert into Activity table 
			// else update the Activity table
		
			return activity;
			
			
		}

	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
	
		Activity activity1 = new Activity();
		
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
	
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
		
	}
	
	@Override
	public Activity findActivity(String activityId) {
		
		if (activityId.equals("7777")){
			return null;
		}
		
		Activity activity1 = new Activity();
		
		activity1.setId(activityId);
		activity1.setDescription("Basketball");
		activity1.setDuration(55);

		User user = new User();	//create new User
		user.setId("1234");
		user.setName("Andy");

		//set user to Activity	
		activity1.setUser(user);
		
		return activity1;
	}
	
	
}
