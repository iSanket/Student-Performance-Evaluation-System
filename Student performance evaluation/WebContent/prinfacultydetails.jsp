<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-dojo-tags" prefix="d" %>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty Details</title>
</head>
<body>
<div>
			<div>
				<h2>FACULTY DETAILS</h2>
			</div>
		<!-- /#header -->
		<div>
			<div>
				<ul>
					<li>			
						<form action="princfac1">
				            <fieldset>
				                <legend>Faculty Details
				                </legend>
				                <p>
				                
				                    <label>FirstName *
				                    </label>
				                    <s:textfield name="fname"></s:textfield>
													</p>
													<p>
				                    <label>MiddleName *
				                    </label>
				                    <s:textfield name="mname"></s:textfield>
				                    </p>
				                    <p>
									<label>LastName *
				                    </label>
				                    <s:textfield name="lname"></s:textfield>
				                </p>
				                              <d:head/>
								<p>
				                    <label>Date of Birth *
				                    </label>
				                    <d:datetimepicker name="dob" displayFormat="dd-MMM-yyyy" />
				                     
				                     <label>Upload Image *
				                    </label>
				                     <s:file name="image" size="25"></s:file>
				                </p>	
								<p>
				                    <label>Gender *</label>
				                    <s:radio name="gender"  list="{'male','female'}" />
				                </p>
								<p>
				                    <label>Nationality *
				                    </label>
				                    <s:textfield name="nationality" ></s:textfield>																			
								<p>
							</fieldset>
							<fieldset>
							 <legend>Academics Details
				                </legend>
				                <p>
				                	
				                    <label>SSC Percentage *
				                    </label>
				                    <s:textfield name="spname"></s:textfield>
									</p>
									<p>
				                    <label>INTER Percentage *
				                    </label>
				                    <s:textfield name="ipname"></s:textfield>
									</p>
									
									<label>Graduation Percentage *
				                    </label>
				                    <s:textfield name="gpname"></s:textfield>
				                    
				                    <label>Post Graduation Percentage *
				                    </label>
				                    <s:textfield name="pgname"></s:textfield>
				                
				               
				 				<p>
				                    <label>Mobile Number *
				                    </label>
				                   <s:textfield name="phno" ></s:textfield>
				         
				                    <label>Email Address *
				                    </label>
				                    <s:textfield name="emailid"></s:textfield>
				                </p>
				            </fieldset>
				            <fieldset>
							 <legend>Address Details
				                </legend>
				                <p>
				                    <label>Door No/Flat no  *
				                    </label>
				                    <s:textfield name="pdoorno" ></s:textfield>
				                </p>
								<p>
				                    <label>LandMark/Street *
				                    </label>
				                    <s:textfield name="pstreet" ></s:textfield>
				                </p>
								<p>
				                    <label>City *
				                    </label>
				                    <s:textfield name="pcity" ></s:textfield>
				                </p>
								<p>
				                    <label> District *
				                    </label>
				                   <s:textfield name="pdistrict" ></s:textfield>
				                </p>
								<p>
				                    <label>State *
				                    </label>
				                    <s:textfield name="pstate"></s:textfield>
				                </p>
								<p>
				                    <label>Country *
				                    </label>
				                    <s:textfield name="pcountry"></s:textfield>
				                </p>
								<p>
				                    <label>Pincode *
				                    </label>
				                    <s:textfield name="ppincode"></s:textfield>
				                </p>
				            </fieldset>										
				            <div><button class="button">ENTER DETAILS</button></div>
			        </form>	
			        </ul>
			</div>
		</div>
		<div>
			
		</div>
	</div>

</body>
</html>