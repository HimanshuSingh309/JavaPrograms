package selenium;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Xpath: It is address of the element in HTML DOM
		// Absolute Xpath: Start search from the root
		// Relative / Dynamic Xpath: Using element attributes with Xpath functions.
		
		// Formula: 
		
		// 1. htmlTag//[@attrName='value']
		// input//[@name='search']
		// input//[@placeholder='Search']
		
		// 2. htmlTag//[@attr1 = 'value' and @attr2 = 'value']
		// //*  ---> total num of elements on webpage.
		
		// text() in Xpath ---> headers, links, spans
		// htmlTag[text()='value']
		// //span[text()='Fashion'] --> FlipKart
		// //a[text()='Cart']  ===> FlipKart
		
		// text() wiith Attributes
		// //a[text()='Cart' and @title='Cart']  ---> FlipKart
		
		// contains() in Xpath
		// contains() can be used with the text also & with the attributes also
		
		// contains() with attributes
		
		// formula---> htmltag[contains(@attri,'value')]
		
		// //input[contains(@placeholder,'Search for Products, Brands and More')]  ---> FlipKart search box
		// //a[contains(@title,'Login' )and (@class='_1TOQfO')] ---> Mulitple Attributes
		// //a[contains(@title,'Login' )and contains(@class,'_1TOQfO')]
		
		// contains() with text()
		// formula ---> //htmltag[contains(text(),'value']
		// //div[contains(text(),'Yoga Mat')]
		// //a[contains(text(),'Mobiles & Accessories') and @class='_2qvBBJ _2Mji8F']
		// //a[contains(text(),'Mobiles & Accessories') and contains(@class,'_2qvBBJ _2Mji8F')]
		
		// contains() with dynamic attributes
		// <input id = firstname_123>
		// <input id = firstname_456>
		// <input id = firstname_789>
		// <input id = firstname_456>
		//driver.findElement(By.id("firstname_123").sendkeys("text");  ----> Invalid
		// //input[contains(id,'firstname_')]   ----> valid
		
		// Google language links
		// //div[@id='SIvCob']/a  ---> /a because it's direct child of div tag
		// for immediate child we use single slash / and for indirect child we use double slash //
		
		// Space with text: 
		// //label[normalize-space()='Yes']
		
		// Indexing ---> Capture Group
		// (//input[@class='form-control'])[1] ---> Capture group
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]  ---> Pointing to Amazon footer section help link
		
		// Parent to child
		// direct child: / ---> //div[@id='SIvCob']/a --> Google lang links
		// Indirect child: // ---> //form[@id='form-currency']//ul[@class='dropdown-menu']//button
		// direct + indirect: //
		
		// child to parent: //input[@id='input-email']/../../../../../../../../../..  BackWard traversing in Xpath
		// Check label of text field: //input[@id='input-email']/../label[@for='input-email']
		// //input[@id='input-firstname']/../../label[text()='First Name']
		// child ---> parent ---> child 
		// //input[@id='input-firstname']/parent::div/parent::div/label[text()='First Name']
		// //input[@id='input-email']/parent::div/child::label[@for='input-email']
		
		// child parent Preceding Sibling:
		// //input[@id='input-firstname']/parent::div/preceding-sibling::label[@for='input-firstname']
		// //input[@id='input-email']/preceding-sibling::label
		
		// Verify that careers is coming under "Get to Know us" column at Amazon footer
		// //a[text()='Careers']/ancestor::ul/preceding-sibling::div
		
		// Following Sibling
		// //label[@for='input-email']/following-sibling::input[@name='email']
		// Verify that How many child are available for "Get to know us"
		// //div[text()='Get to Know Us']/following-sibling::ul//a
		// //div[text()='Get to Know Us']/parent::div//a
		//
		
		
		

	}

}
