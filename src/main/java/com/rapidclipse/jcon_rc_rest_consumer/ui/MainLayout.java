
package com.rapidclipse.jcon_rc_rest_consumer.ui;

import com.rapidclipse.jcon_rc_rest_consumer.HasTitle;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;


public class MainLayout extends AppLayout
{
	private final H2 title = new H2();
	
	public MainLayout()
	{
		this.addToNavbar(new DrawerToggle(), this.title);
		
		this.addDrawerEntry(VaadinIcon.HOME, "Home", HomeView.class);
		this.addDrawerEntry(VaadinIcon.PICTURE, "Pictures", PicturesView.class);
		this.addDrawerEntry(VaadinIcon.TASKS, "Todos", TodosView.class);
	}
	
	private void addDrawerEntry(final VaadinIcon icon, final String label, final Class<? extends Component> linkTarget)
	{
		final HorizontalLayout layout = new HorizontalLayout(icon.create(), new RouterLink(label, linkTarget));
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setPadding(false);
		this.addToDrawer(layout);
	}
	
	@Override
	public void showRouterLayoutContent(final HasElement content)
	{
		this.title.setText(content instanceof HasTitle ? ((HasTitle)content).getTitle() : "");
		super.showRouterLayoutContent(content);
	}
}
