<%@ include file="common/header.jspf"%>
<div class="col-sm-19 col-xs-6">
	<div>
	<div>
    <table class="table table-striped">
        <thead>
            <tr>
                
                <th class="text-info text-center">etat</th>
                <th class="text-info text-right">cout estimee</th>
                <th class="text-info text-right">temps estimee</th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="text-center">${ commentaire }</td>
                <td class="text-right">${ cout } AR</td>
                <td class="text-right">${ temps }</td>
            </tr>
        </tbody>
    </table>
	</div>
	</div>
	<div>
			<table class="table table-hover table-expansed table-radius ">
    			<caption class="text-center">details par portion</caption>
    			<thead>
        			<tr>
            			<th>PK debut</th>
            			<th>PK fin</th>
            			<th>etat</th>
            
        			</tr>
    			</thead>
    			<tfoot>
        			<tr>
            			<td class="text-center" colspan="5">...</td>
        			</tr>
    			</tfoot>
    			<tbody>
    				<c:forEach items="${portions}" var="portion">
        				<tr>
            				<td>${ portion.getDebut() } </td>
            				<td>${ portion.getFin() } </td>
            				<td>${ portion.getEtat() } </td>

        				</tr>
        			</c:forEach>
    			</tbody>
			</table>
		</div>
</div>
<%@ include file="common/footer.jspf"%>