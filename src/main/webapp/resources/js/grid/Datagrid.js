$(document).ready(function() {
            var grid = $("#list"),
                mydata = [
                   {id:"1",invdate:"2007-10-01",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"2",invdate:"2007-10-02",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"3",invdate:"2007-09-01",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"},
                   {id:"4",invdate:"2007-10-04",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"5",invdate:"2007-10-05",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"6",invdate:"2007-09-06",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"},
                   {id:"7",invdate:"2007-10-04",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"8",invdate:"2007-10-03",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"9",invdate:"2007-09-01",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"},
                   {id:"10",invdate:"2007-10-01",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"11",invdate:"2007-10-02",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"12",invdate:"2007-09-01",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"},
                   {id:"13",invdate:"2007-10-04",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"14",invdate:"2007-10-05",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"15",invdate:"2007-09-06",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"},
                   {id:"16",invdate:"2007-10-04",name:"test",note:"note",amount:"200.00",tax:"10.00",total:"210.00"},
                   {id:"17",invdate:"2007-10-03",name:"test2",note:"note2",amount:"300.00",tax:"20.00",total:"320.00"},
                   {id:"18",invdate:"2007-09-01",name:"test3",note:"note3",amount:"400.00",tax:"30.00",total:"430.00"}
                ];

            grid.jqGrid({
                datatype: "local",
                data: mydata,
                colNames:['Inv No','Date', 'Client', 'Amount','Tax','Total','Notes'],
                colModel:[
                    {name:'id',index:'id', key: true, width:70, sorttype:"int",  editable: true },
                    {name:'invdate',index:'invdate', width:90, sorttype:"date",  editable: true },
                    {name:'name',index:'name', width:100},
                    {name:'amount',index:'amount', width:80, align:"right",sorttype:"float",  editable: true },
                    {name:'tax',index:'tax', width:80, align:"right",sorttype:"float",  editable: true },
                    {name:'total',index:'total', width:80,align:"right",sorttype:"float",  editable: true },
                    {name:'note',index:'note', width:150, sortable:false,  editable: true }
                ],
               /* search:true,*/
                pager:'#pager',
                jsonReader: {cell:""},
                rowNum: 10,
                rowList: [5, 10, 20, 50],
                sortname: 'id',
                sortorder: 'asc',
                viewrecords: true,
                height: "100%",
                caption: "Multiple search with local data"
            });
         
            grid.jqGrid('filterToolbar', {stringResult: true, searchOnEnter: false, defaultSearch : "cn"});
            
            
            $('#list').navGrid('#pager',
                    // the buttons to appear on the toolbar of the grid
                    { edit: true, add: true, del: true, search: false, refresh: false, view: false, position: "left", cloneToTop: false },
                    // options for the Edit Dialog
                    {
                        editCaption: "The Edit Dialog",
                        recreateForm: true,
    					checkOnUpdate : true,
    					checkOnSubmit : true,
                        closeAfterEdit: true,
                        errorTextFormat: function (data) {
                            return 'Error: ' + data.responseText
                        }
                    },
                    // options for the Add Dialog
                    {
                        closeAfterAdd: true,
                        recreateForm: true,
                        errorTextFormat: function (data) {
                            return 'Error: ' + data.responseText
                        }
                    },
                    // options for the Delete Dailog
                    {
                        errorTextFormat: function (data) {
                            return 'Error: ' + data.responseText
                        }
                    });
            
        });