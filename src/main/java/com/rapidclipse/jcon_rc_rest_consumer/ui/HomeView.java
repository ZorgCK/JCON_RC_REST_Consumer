
package com.rapidclipse.jcon_rc_rest_consumer.ui;

import com.rapidclipse.jcon_rc_rest_consumer.HasTitle;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout implements HasTitle
{
	public HomeView()
	{
		super();
		this.initUI();
	}
	
	@Override
	public String getTitle()
	{
		return "Home";
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.paragraph = new Paragraph();
		
		this.paragraph.setText(
			"This is the View that is shown at the root path. This could tell the user what this website has to offer.");
		
		this.paragraph.setWidthFull();
		this.paragraph.setHeight(null);
		this.add(this.paragraph);
		this.setWidthFull();
		this.setHeight(null);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Paragraph paragraph;
	// </generated-code>
	
}