<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="login.js"></script>
<title>Support</title>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
<script id="spHTMLFormElementPrototypeScript">(function ()

  {

	  try

	  {

		document.sp_old_HTMLFormElementPrototype = new Object();

		document.sp_old_HTMLFormElementPrototype.submit = HTMLFormElement.prototype.submit;

		HTMLFormElement.prototype.submit = function(AEvent)

		{

		  var spEvent = document.createEvent('Event');

		  spEvent.initEvent('sp_submit', true, true);

		  this.dispatchEvent(spEvent);

		  document.sp_old_HTMLFormElementPrototype.submit.apply(this);

		};

	  }

	  catch(ErrorMessage)

	  {

		alert('Error attaching to HTMLFormElement.prototype.submit: ' + ErrorMessage);

	  }



	  try

	  {

		if (typeof __doPostBack == 'function')

		{

		  (function() {		

			var sp_old__doPostBack = __doPostBack;

			__doPostBack = function(eventTarget, eventArgument)

			{

			  try

			  {

				var spEvent = document.createEvent('Event');

				spEvent.initEvent('sp_submit', true, true);

				window.dispatchEvent(spEvent);

			  }

			  catch(ErrorMessage)

			  {

				alert('Error sending doPostBack event: ' + ErrorMessage);

			  }

			  sp_old__doPostBack(eventTarget, eventArgument);

			};      

		  })();

		}

	  }

	  catch(ErrorMessage)

	  {

		alert('Error attaching to __doPostBack(): ' + ErrorMessage);

	  }

  })();</script>


    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<%@ include file="navbar.jsp" %>
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">About Us</h2>
                    <hr class="primary">
                    <p>StudentRFID Project Developed by<strong> Shubham Sharma & Shreya Gupta</strong></p>
                </div>
                <div class="col-lg-4 col-lg-offset-2 text-center">
                    <i class="wow bounceIn">
                    		 	
					
 	
<svg version="1.1" id="Layer_3" xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="214px" height="293px" viewBox="232 0 214 293" enable-background="new 232 0 214 293" xml:space="preserve">

<g opacity="0.07"><polyline points="276.254,163.946 297.803,207.067 303.637,229.739 282.863,214.848 276.254,192.517"></polyline></g>
<g opacity="0.07"><polyline points="401.491,163.946 379.943,207.067 374.109,229.739 394.882,214.848 401.491,192.517"></polyline></g>

<!-- NECK SHADOW -->
<g opacity="0.07">
	<path d="M387.977,224.462c0.011-1.892-0.004-3.784-0.057-5.676c-0.511,0.541-1.026,1.075-1.553,1.601
		c-1.146,1.145-2.33,2.256-3.576,3.294c-0.318,0.267-0.646,0.521-0.97,0.78c-0.366,0.314-0.725,0.634-1.073,0.968
		c-0.497,0.507-0.965,1.041-1.412,1.592c-0.974,1.193-1.9,2.437-3.08,3.438c-1.222,1.04-2.92,1.661-4.39,2.264
		c-1.71,0.7-3.397,1.327-4.874,2.459c-1.204,0.922-2.324,1.941-3.488,2.91c-0.904,0.753-1.832,1.419-2.81,1.979
		c-0.122,0.072-0.241,0.151-0.366,0.221c-0.543,0.3-1.103,0.549-1.678,0.756c-0.863,0.329-1.767,0.577-2.73,0.728
		c-6.997,1.085-14.121-0.176-21.134-0.432c-1.276-0.047-2.548-0.075-3.817-0.112c-0.791-0.012-1.581-0.028-2.372-0.07
		c-0.494-0.025-0.989-0.059-1.482-0.098c-1.108-0.071-2.217-0.167-3.327-0.311c-2.949-0.382-6.058-0.724-8.816-1.911
		c-2.107-0.906-3.877-2.329-5.626-3.787c-2.574-2.146-5.171-4.251-7.637-6.523c-4.135-3.81-8.1-7.826-12.407-11.438v13.981
		l25.961,24.689h47.667l24.928-23.707C387.908,229.524,387.962,226.993,387.977,224.462z"></path>
</g>

<!-- HAIR -->
<g>
	<polyline fill="#333333" points="397.008,151.349 397.008,84.319 375.559,70.665 328.637,100.406 328.637,78.286 309.868,91.693 
		309.868,70.912 292.439,82.309 292.439,66.891 279.034,84.319 279.034,147.327 263.577,87 274.341,44.1 288.418,51.475 
		288.418,34.186 305.176,40.748 305.176,13.407 325.285,28.825 325.285,0 355.45,26.814 355.45,4.693 379.581,38.879 
		379.581,18.099 415.494,69.573 397.008,151.349 	"></polyline>
</g>

<!-- NOSE -->
<g>
	<line fill="#333333" x1="329.045" y1="176.567" x2="349.154" y2="176.567"></line>
	<rect x="329.045" y="172.551" fill="#333333" width="20.109" height="8.033"></rect>
</g>

<!-- SHOULDERS AND NECK -->
<g><rect x="263.996" y="238.391" transform="matrix(0.5234 0.8521 -0.8521 0.5234 355.006 -101.254)" fill="#333333" width="8.033" height="56.635"></rect></g>
<g><rect x="259.78" y="245.334" transform="matrix(0.1079 0.9942 -0.9942 0.1079 508.5147 -67.9932)" fill="#333333" width="64.728" height="8.033"></rect></g>
<g><rect x="381.519" y="262.692" transform="matrix(0.8522 0.5233 -0.5233 0.8522 200.1428 -175.0244)" fill="#333333" width="56.635" height="8.032"></rect></g>
<g><rect x="381.688" y="216.987" transform="matrix(0.9942 0.108 -0.108 0.9942 29.175 -40.1841)" fill="#333333" width="8.032" height="64.728"></rect></g>

<!-- LEFT EYEBROW -->
<g>
	<line fill="#333333" x1="298.77" y1="115.653" x2="326.922" y2="115.653"></line>
	<rect style="transform: translateY(0px);" class="left-eyebrow" x="298.77" y="111.636" fill="#333333" width="28.152" height="8.033"></rect>
</g>

<!-- RIGHT EYEBROW -->
<g>
	<line fill="#333333" x1="349.655" y1="115.653" x2="379.206" y2="115.653"></line>
	<rect style="transform: translateY(0px);" class="right-eyebrow" x="349.655" y="111.636" fill="#333333" width="29.551" height="8.033"></rect>
</g>

<!-- EYES -->
<g><circle style="transform-origin: 50% 50% 0px; transform: scaleY(1);" class="left-eye" fill="#333333" cx="313.503" cy="137.523" r="8.294"></circle></g>
<g><circle style="transform-origin: 50% 50% 0px; transform: scaleY(1);" class="right-eye" fill="#333333" cx="364.964" cy="137.523" r="8.295"></circle></g>

<!-- JAW -->
<g><path fill="#333333" d="M364.533,246.856h-50.877l-38.782-36.882V60.186l64.09-16.592l64.351,12.361v154.02L364.533,246.856z
	M316.866,238.824h44.457l33.959-32.296V62.591l-56.057-10.768l-56.319,14.58v140.125L316.866,238.824z"></path>
</g>

<!-- RIGHT EAR -->
<g><path fill="#333333" d="M395.282,192.437v-54.648h23.521v39.378L395.282,192.437z M403.314,145.821v31.823l7.455-4.84v-26.983
		H403.314z"></path></g>
		
<!-- LEFT EAR -->		
<g><path fill="#333333" d="M282.906,192.437l-23.518-15.271v-39.378h23.518V192.437z M267.42,172.805l7.454,4.84v-31.823h-7.454
		V172.805z"></path></g>

<!-- TSHIRT -->
<g>
	<path fill="#333333" d="M339.126,291.738c-19.477,0-35.104-2.204-46.452-6.553c-13.162-5.044-20.854-13.007-22.861-23.668
		l7.894-1.486c3.687,19.567,35.435,23.675,61.42,23.675c36.89,0,57.483-7.642,61.21-22.711l7.798,1.928
		c-2.543,10.28-10.413,17.904-23.394,22.661C373.595,289.667,358.248,291.738,339.126,291.738z"></path>
</g>

<!-- nothing -->
<g><path fill="none" stroke="#000000" stroke-width="23" stroke-miterlimit="10" d="M339.187,234.638"></path></g>
<g><path fill="none" stroke="#000000" stroke-width="14" stroke-miterlimit="10" d="M326.922,280.827"></path></g>

<!-- MOUTH -->
<g><rect x="336.422" y="185.605" transform="matrix(0.1122 0.9937 -0.9937 0.1122 509.8884 -152.7674)" fill="#333333" width="8.033" height="46.727"></rect></g>
<g><path fill="none" stroke="#000000" stroke-width="23" stroke-miterlimit="10" d="M295.636,281.525"></path></g>
</svg>
</i>
       	           
                    <p>Shubham Sharma</p>
                    <p>+91-9479-809326</p>
                    <i class="wow bounceIn" data-wow-delay="2s"></i>
               		<p><a href="mailto:shubham6618@outlook.com">shubham6618@outlook.com</a></p>
                   
                </div>
                <div class="col-lg-4 text-center">
                    <i class="fa fa-phone fa-3x wow bounceIn" data-wow-delay="2s"><svg version="1.1" id="Layer_3" xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="214px" height="293px" viewBox="232 0 214 293" enable-background="new 232 0 214 293" xml:space="preserve">

<g opacity="0.07"><polyline points="276.254,163.946 297.803,207.067 303.637,229.739 282.863,214.848 276.254,192.517"></polyline></g>
<g opacity="0.07"><polyline points="401.491,163.946 379.943,207.067 374.109,229.739 394.882,214.848 401.491,192.517"></polyline></g>

<!-- NECK SHADOW -->
<g opacity="0.07">
	<path d="M387.977,224.462c0.011-1.892-0.004-3.784-0.057-5.676c-0.511,0.541-1.026,1.075-1.553,1.601
		c-1.146,1.145-2.33,2.256-3.576,3.294c-0.318,0.267-0.646,0.521-0.97,0.78c-0.366,0.314-0.725,0.634-1.073,0.968
		c-0.497,0.507-0.965,1.041-1.412,1.592c-0.974,1.193-1.9,2.437-3.08,3.438c-1.222,1.04-2.92,1.661-4.39,2.264
		c-1.71,0.7-3.397,1.327-4.874,2.459c-1.204,0.922-2.324,1.941-3.488,2.91c-0.904,0.753-1.832,1.419-2.81,1.979
		c-0.122,0.072-0.241,0.151-0.366,0.221c-0.543,0.3-1.103,0.549-1.678,0.756c-0.863,0.329-1.767,0.577-2.73,0.728
		c-6.997,1.085-14.121-0.176-21.134-0.432c-1.276-0.047-2.548-0.075-3.817-0.112c-0.791-0.012-1.581-0.028-2.372-0.07
		c-0.494-0.025-0.989-0.059-1.482-0.098c-1.108-0.071-2.217-0.167-3.327-0.311c-2.949-0.382-6.058-0.724-8.816-1.911
		c-2.107-0.906-3.877-2.329-5.626-3.787c-2.574-2.146-5.171-4.251-7.637-6.523c-4.135-3.81-8.1-7.826-12.407-11.438v13.981
		l25.961,24.689h47.667l24.928-23.707C387.908,229.524,387.962,226.993,387.977,224.462z"></path>
</g>

<!-- HAIR -->
<g>
	<polyline fill="#333333" points="397.008,151.349 397.008,84.319 375.559,70.665 328.637,100.406 328.637,78.286 309.868,91.693 
		309.868,70.912 292.439,82.309 292.439,66.891 279.034,84.319 279.034,147.327 263.577,87 274.341,44.1 288.418,51.475 
		288.418,34.186 305.176,40.748 305.176,13.407 325.285,28.825 325.285,0 355.45,26.814 355.45,4.693 379.581,38.879 
		379.581,18.099 415.494,69.573 397.008,151.349 	"></polyline>
</g>

<!-- NOSE -->
<g>
	<line fill="#333333" x1="329.045" y1="176.567" x2="349.154" y2="176.567"></line>
	<rect x="329.045" y="172.551" fill="#333333" width="20.109" height="8.033"></rect>
</g>

<!-- SHOULDERS AND NECK -->
<g><rect x="263.996" y="238.391" transform="matrix(0.5234 0.8521 -0.8521 0.5234 355.006 -101.254)" fill="#333333" width="8.033" height="56.635"></rect></g>
<g><rect x="259.78" y="245.334" transform="matrix(0.1079 0.9942 -0.9942 0.1079 508.5147 -67.9932)" fill="#333333" width="64.728" height="8.033"></rect></g>
<g><rect x="381.519" y="262.692" transform="matrix(0.8522 0.5233 -0.5233 0.8522 200.1428 -175.0244)" fill="#333333" width="56.635" height="8.032"></rect></g>
<g><rect x="381.688" y="216.987" transform="matrix(0.9942 0.108 -0.108 0.9942 29.175 -40.1841)" fill="#333333" width="8.032" height="64.728"></rect></g>

<!-- LEFT EYEBROW -->
<g>
	<line fill="#333333" x1="298.77" y1="115.653" x2="326.922" y2="115.653"></line>
	<rect style="transform: translateY(0px);" class="left-eyebrow" x="298.77" y="111.636" fill="#333333" width="28.152" height="8.033"></rect>
</g>

<!-- RIGHT EYEBROW -->
<g>
	<line fill="#333333" x1="349.655" y1="115.653" x2="379.206" y2="115.653"></line>
	<rect style="transform: translateY(0px);" class="right-eyebrow" x="349.655" y="111.636" fill="#333333" width="29.551" height="8.033"></rect>
</g>

<!-- EYES -->
<g><circle style="transform-origin: 50% 50% 0px; transform: scaleY(1);" class="left-eye" fill="#333333" cx="313.503" cy="137.523" r="8.294"></circle></g>
<g><circle style="transform-origin: 50% 50% 0px; transform: scaleY(1);" class="right-eye" fill="#333333" cx="364.964" cy="137.523" r="8.295"></circle></g>

<!-- JAW -->
<g><path fill="#333333" d="M364.533,246.856h-50.877l-38.782-36.882V60.186l64.09-16.592l64.351,12.361v154.02L364.533,246.856z
	M316.866,238.824h44.457l33.959-32.296V62.591l-56.057-10.768l-56.319,14.58v140.125L316.866,238.824z"></path>
</g>

<!-- RIGHT EAR -->
<g><path fill="#333333" d="M395.282,192.437v-54.648h23.521v39.378L395.282,192.437z M403.314,145.821v31.823l7.455-4.84v-26.983
		H403.314z"></path></g>
		
<!-- LEFT EAR -->		
<g><path fill="#333333" d="M282.906,192.437l-23.518-15.271v-39.378h23.518V192.437z M267.42,172.805l7.454,4.84v-31.823h-7.454
		V172.805z"></path></g>

<!-- TSHIRT -->
<g>
	<path fill="#00ff00" d="M339.126,291.738c-19.477,0-35.104-2.204-46.452-6.553c-13.162-5.044-20.854-13.007-22.861-23.668
		l7.894-1.486c3.687,19.567,35.435,23.675,61.42,23.675c36.89,0,57.483-7.642,61.21-22.711l7.798,1.928
		c-2.543,10.28-10.413,17.904-23.394,22.661C373.595,289.667,358.248,291.738,339.126,291.738z"></path>
</g>

<!-- nothing -->
<g><path fill="none" stroke="#000000" stroke-width="23" stroke-miterlimit="10" d="M339.187,234.638"></path></g>
<g><path fill="none" stroke="#000000" stroke-width="14" stroke-miterlimit="10" d="M326.922,280.827"></path></g>

<!-- MOUTH -->
<g><rect x="342.422" y="185.605" transform="matrix(0.1122 0.9937 -0.9937 0.1122 509.8884 -152.7674)" fill="#ff0000" width="8.033" height="46.727"></rect></g>
<g><path fill="none" stroke="#000000" stroke-width="23" stroke-miterlimit="10" d="M295.636,281.525"></path></g>
</svg>
                    
                    </i>
                                        <p>Shreya Gupta</p>
                    <p>+91-9074-261905</p>
                   <!--   <i class="fa fa-envelope-o fa-3x wow bounceIn" data-wow-delay="2s"></i> -->
                    <p><a href="mailto:guptashreya289@yahoo.in">guptashreya289@yahoo.in</a></p>
                </div>
            </div>
        </div>
    </section>

    <!-- jQuery    latest -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>

</body>
</html>