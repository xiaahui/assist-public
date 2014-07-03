package ch.hilbri.assist.datamodel;

import org.eclipse.emf.common.util.EList;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.ApplicationGroup;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.ModelFactory;

public class TestASSIST {

	public static void main(String[] args) {
		ModelFactory factory = ModelFactory.eINSTANCE;
		
		AssistModel model = factory.createAssistModel();
		
		Application app1 = factory.createApplication();
		app1.setName("App1");
		model.getApplications().add(app1);
		
		Application app2 = factory.createApplication();
		app2.setName("App2");
		model.getApplications().add(app2);
		
		Application app3 = factory.createApplication();
		app3.setName("App3");
		model.getApplications().add(app3);
		
		
		ApplicationGroup group1 = factory.createApplicationGroup();
		group1.getApplicationsOrGroups().add(app1);
		group1.getApplicationsOrGroups().add(app2);
		model.getApplicationGroups().add(group1);
		
		ApplicationGroup group2 = factory.createApplicationGroup();
		group2.getApplicationsOrGroups().add(app3);
		group2.getApplicationsOrGroups().add(group1);
		model.getApplicationGroups().add(group2);
		
		EList<Application> list = group2.getAllApplications();
		
		for (Application a : list)
			System.out.println(a.getName());
		
		
	}

}
