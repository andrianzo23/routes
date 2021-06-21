<%@ include file="common/header.jspf"%>	<div class="col-sm-4 col-xs-2">
		<table class="table table-striped ">
    		<caption class="text-center">Liste des villes de Madagascar</caption>
    		<thead>
        		<tr>
            		<th>Nom</th>
            
        		</tr>
    		</thead>
    		<tfoot>
        		<tr>
            		<td class="text-center" colspan="5">Liste des villes de Madagascar</td>
        		</tr>
    		</tfoot>
    		<tbody>
    			<c:forEach items="${villes}" var="ville">
        			<tr>
            			<td>${ ville.getNom() } </td>
            			<td><a type="button" class="btn btn-success" href="/update-ville?id=${ville.getIdVille()}">Update</a> <a type="button" class="btn btn-warning" href="/delete-ville?id=${ville.getIdVille()}">Delete</a></td>
        			</tr>
        		</c:forEach>
    		</tbody>
		</table>
	</div>
<%@ include file="common/footer.jspf"%>