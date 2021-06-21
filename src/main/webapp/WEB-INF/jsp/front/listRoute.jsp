<%@ include file="common/header.jspf"%>
	<div class="col-sm-19 col-xs-6">
		<table class="table table-striped ">
    		<caption class="text-center">Liste des routes de Madagascar</caption>
    		<thead>
        		<tr>
            		<th>Nom</th>
            		<th>debut</th>
            		<th>fin</th>
            		<th>etat global</th>
            
        		</tr>
    		</thead>
    		<tfoot>
        		<tr>
            		<td class="text-center" colspan="5">Liste des routes de Madagascar</td>
        		</tr>
    		</tfoot>
    		<tbody>
    			<c:forEach items="${routes}" var="route">
        			<tr>
            			<td>${ route.getNumero() } </td>
            			<td>${ route.debut } </td>
            			<td>${ route.getFin() } </td>
            			<td>${ routeS.getEtatMoyenne(routeS.getPortionR().findByIdRoute(id)) } </td>
            			<td>
            			<a type="button" class="btn btn-success" href="/details-route?id=${route.getId_Route()}">details</a>
            			<a type="button" class="btn btn-success" href="/update-route?id=${route.getId_Route()}">Update</a>
            			<a type="button" class="btn btn-warning" href="/delete-route?id=${route.getId_Route()}">Delete</a>
            			</td>
        			</tr>
        		</c:forEach>
    		</tbody>
		</table>
	</div>
<%@ include file="common/footer.jspf"%>