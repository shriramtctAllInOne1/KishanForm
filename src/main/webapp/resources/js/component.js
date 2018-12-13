function HtmlButton(id){
	this.id=id;
};


HtmlButton.prototype.addClass = function(val){
		$("#"+this.id).addClass(val);
};
HtmlButton.prototype.removeClass = function(val){
		$("#"+this.id).removeClass(val);
};
HtmlButton.prototype.show = function(){
		$("#"+this.id).show();
};
HtmlButton.prototype.hide = function(){
		$("#"+this.id).hide();
};
HtmlButton.prototype.setValue = function(val){
		$("#"+this.id).val(val);
};




function ModalComp(divId, hdrName) {
	this.id = divId;
	this.hdrName = hdrName;
	$('#'+this.id).addClass(this.id);	
};

ModalComp.prototype.build = function() {
	var modalHeader = $('<div/>', {
		"class": "modal-header"
	});
	var h3 = $('<h3/>', {
		"id": "",
		text: this.hdrName
	});
		
	var clsbtn = $('<input/>', {
		"type": "button",
		"class": "closeBtn"
	});

	h3.appendTo(modalHeader);
	clsbtn.appendTo(modalHeader);
	
	var modalBody = $('<div/>', {
		"class": "modal-body"
	});		

	var modalCont = $('<div/>', {
		"class": "colModalCont",
		"id": "colModalCont"
	});				
	modalCont.appendTo(modalBody);	
	var modalFooter = $('<div/>', {
		"class": "modal-footer"
	});		
	
	$("#"+this.id).html('');
	$("#"+this.id).append(modalHeader);
	$("#"+this.id).append(modalBody);
//	$("#"+this.id).append(modalFooter);	
};

ModalComp.prototype.show = function(){
		$("#"+this.id).fadeIn(300);
};
ModalComp.prototype.hide = function(){
		$("#"+this.id).fadeOut(300);
};


function ModalComp2(divId, yAxisVal) {
	this.id = divId;
	this.yAxis = yAxisVal;
//	$('#'+this.id).addClass(this.id);	
};

ModalComp2.prototype.build = function() {
	var modalBody = $('<div/>', {
		"class": "modalBody"
	});		
	var modalCont = $('<div/>', {
		"class": "bubCont",
		"id": "",
		text: 'Bubble Data'
	});	
	var modalCont2 = $('<div/>', {
		"class": "bubCont",
		"id": "",
		text: this.yAxis
	});	
	
	var clsbtn = $('<input/>', {
		"type": "button",
		"id": "closebtn",
		"class": "close",
		"value": "X"
	});	
	
	modalCont.appendTo(modalBody);
	modalCont2.appendTo(modalBody);
	clsbtn.appendTo(modalBody);	
	$("#"+this.id).html('');
	$("#"+this.id).append(modalBody);
};

ModalComp2.prototype.addClass = function() {
	$('#'+this.id).addClass(this.id);
};

ModalComp2.prototype.show = function(){
		$("#"+this.id).fadeIn(300);
};
ModalComp2.prototype.hide = function(){
		$("#"+this.id).fadeOut(300);
};


function MaskComp(divId) {
	this.id = divId;
	$('#'+this.id).addClass(this.id);
};


MaskComp.prototype.show = function(){
		$("#"+this.id).fadeIn(300);
};
MaskComp.prototype.hide = function(){
		$("#"+this.id).fadeOut(300);
};

function GoGreenOverlay(divId, hdrName, userNm, eligible, curRank, curScr) {
	this.id = divId;
	this.hdrName = hdrName;
	this.userNm = userNm;
	this.eligible = eligible;
	this.curRank = curRank;
	this.curScr = curScr;
	$('#'+this.id).addClass('overlay');	
};


GoGreenOverlay.prototype.build = function() {
	var modalHeader = $('<div/>', {
		"class": "modal-header"
	});
	var h3 = $('<h3/>', {
		"id": "",
		text: this.hdrName
	});
		
	var clsbtn = $('<input/>', {
		"type": "button",
		"class": "closeBtn"
	});

	h3.appendTo(modalHeader);
	clsbtn.appendTo(modalHeader);
	
	var modalBody = $('<div/>', {
		"class": "modal-body"
	});		

	var userUlObj = $('<div/>', {
		"class": "overlayHeaderDetails",
		"id": ""
	});				
	
	var nmLi = $('<div/>', {
		"class": ""
	});				
	var nmLbl = $('<div/>', {
		text: "Name",
		"class": "contentHeader"
	});				
	var userNm = $('<div/>', {
		text: this.userNm,
		"class": "contentdetail"
	});				
	nmLbl.appendTo(nmLi);
	userNm.appendTo(nmLi);
	
	var eligLi = $('<div/>', {
		"class": ""
	});				
	var eligLbl = $('<div/>', {
		text: "Eligibility",
		"class": "contentHeader"
	});				
	var eligVal = $('<div/>', {
		text: this.eligible,
		"class": "contentdetail"
	});				
	eligLbl.appendTo(eligLi);
	eligVal.appendTo(eligLi);

	var curRankLi = $('<div/>', {
		"class": ""
	});				
	var curRankLbl = $('<div/>', {
		text: "Current Rank",
		"class": "contentHeader"
	});				
	var curRankVal = $('<div/>', {
		text: this.curRank,
		"class": "contentdetail"
	});				
	curRankLbl.appendTo(curRankLi);
	curRankVal.appendTo(curRankLi);

	var curScrLi = $('<div/>', {
		"class": ""
	});				
	var curScrLbl = $('<div/>', {
		text: "Current CO2e Score",
		"class": "contentHeader"
	});				
	var curScrVal = $('<div/>', {
		text: this.curScr,
		"class": "contentdetail"
	});				
	curScrLbl.appendTo(curScrLi);
	curScrVal.appendTo(curScrLi);

	
	nmLi.appendTo(userUlObj);
	eligLi.appendTo(userUlObj);
	curRankLi.appendTo(userUlObj);
	curScrLi.appendTo(userUlObj);
	userUlObj.appendTo(modalBody);	
	
	var overlayCont = $('<div/>', {
		"class": "overlayContents",
		"id": "overlayContents"
	});	
	
	
				
	overlayCont.appendTo(modalBody);	
	var modalFooter = $('<div/>', {
		"class": "modal-footer"
	});		
	
	$("#"+this.id).html('');
	$("#"+this.id).append(modalHeader);
	$("#"+this.id).append(modalBody);
//	$("#"+this.id).append(modalFooter);	
};

GoGreenOverlay.prototype.show = function(){
		$("#"+this.id).fadeIn(300);
};
GoGreenOverlay.prototype.hide = function(){
		$("#"+this.id).fadeOut(300);
};


function GoGreenOverlay2(divId, hdrName) {
    this.id = divId;
    this.hdrName = hdrName;
    $('#'+this.id).addClass('overlay');        
};

GoGreenOverlay2.prototype.build = function() {
    var modalHeader = $('<div/>', {
            "class": "modal-header"
    });
    var h3 = $('<h3/>', {
            "id": "",
            text: this.hdrName
    });
            
    var clsbtn = $('<input/>', {
            "type": "button",
            "class": "closeBtn2"
    });

    h3.appendTo(modalHeader);
    clsbtn.appendTo(modalHeader);
    
    var modalBody = $('<div/>', {
            "class": "modal-body"
    });                
    
    var overlayCont = $('<div/>', {
            "class": "overlayContents",
            "id": "overlayContents"
    });        
                            
    overlayCont.appendTo(modalBody);        
    
    $("#"+this.id).html('');
    $("#"+this.id).append(modalHeader);
    $("#"+this.id).append(modalBody);
};


GoGreenOverlay2.prototype.show = function(){
    $("#"+this.id).fadeIn(300);
};
GoGreenOverlay2.prototype.hide = function(){
    $("#"+this.id).fadeOut(300);
};

function CoupDetails(divId, cpVal, cpId, cpExpDt, cpFlNm) {
    this.id = divId;
    this.cpVal = cpVal;
    this.cpId = cpId;
    this.cpExpDt = cpExpDt;
    this.cpFlNm = cpFlNm;
    
    $('#'+this.id).addClass('floatright');   	
};

CoupDetails.prototype.build = function() {
    var h4 = $('<h4/>', {
        text: "Coupon Details"
    });	
    var table = $('<table/>');
    var tr1 = $('<tr/>');
    var tr2 = $('<tr/>');
    var tr3 = $('<tr/>');
    var tr4 = $('<tr/>');
 
    var td1tr1 = $('<td/>', {
    	text : "Value"
    });    
    var td2tr1 = $('<td/>', {
    	text: this.cpVal
    });
    td1tr1.appendTo(tr1);
    td2tr1.appendTo(tr1);

    var td1tr2 = $('<td/>', {
    	text : "ID"
    });    
    var td2tr2 = $('<td/>', {
    	text: this.cpId
    });
    td1tr2.appendTo(tr2);
    td2tr2.appendTo(tr2);

    var td1tr3= $('<td/>', {
    	text : "Expiry Date"
    });    
    var td2tr3 = $('<td/>', {
    	text: this.cpExpDt
    });
    td1tr3.appendTo(tr3);
    td2tr3.appendTo(tr3);

    var td1tr4= $('<td/>', {
    	text : "File Name"
    });    
    var td2tr4 = $('<td/>', {
    	text: this.cpFlNm
    });
    td1tr4.appendTo(tr4);
    td2tr4.appendTo(tr4);
    
    
    
    tr1.appendTo(table);
    tr2.appendTo(table);
    tr3.appendTo(table);
    tr4.appendTo(table);
    $("#"+this.id).html('');
    $("#"+this.id).append(h4);
    $("#"+this.id).append(table);

};

CoupDetails.prototype.show = function(){
    $("#"+this.id).show();
};


function AlertMsgComp(divId, alertTxt) {
	this.id = divId;
	this.alertTxt = alertTxt;
	$("#"+this.id).addClass('cmnMsgCont');
};

AlertMsgComp.prototype.build = function() {
	var alertMsgCont = $('<div/>', {
		"class" : "alertMsgCont"
	});	
	var alertMsgTxt = $('<div/>', {
		"class" : "alertMsgTxt",
		text : this.alertTxt
	});
	
	alertMsgTxt.appendTo(alertMsgCont);
	$("#"+this.id).append(alertMsgCont);

};

AlertMsgComp.prototype.show = function() {
	$("#"+this.id).show();
};


function ErrorMsgComp(divId, errtTxt) {
	 this.id = divId;
	 this.errtTxt = errtTxt;
	 $('#'+this.id).addClass('cmnMsgCont');    	 
};

ErrorMsgComp.prototype.build = function() {
	var errMsgCont = $('<div/>', {
		"class" : "errMsgCont"
	});		
	var errMsgTxt = $('<div/>', {
		"class" : "errMsgTxt",
		text : this.errtTxt
	});
	errMsgTxt.appendTo(errMsgCont);
	$("#"+this.id).append(errMsgCont);
};

ErrorMsgComp.prototype.show = function() {
	$("#"+this.id).show();
};


function InfoMsgComp(divId, infoTxt) {
	 this.id = divId;
	 this.infoTxt = infoTxt;
	 $('#'+this.id).addClass('cmnMsgCont');    	 
};

InfoMsgComp.prototype.build = function() {
	var infoMsgCont = $('<div/>', {
		"class" : "infoMsgCont"
	});			
	var infoMsgTxt = $('<div/>', {
		"class" : "infoMsgTxt",
		text : this.infoTxt
	});
	infoMsgTxt.appendTo(infoMsgCont);
	$("#"+this.id).append(infoMsgCont);
};

InfoMsgComp.prototype.show = function() {
	$("#"+this.id).show();
};


