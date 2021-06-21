<%@ include file="common/header.jspf"%>	<div class="col-sm-4 col-xs-2">
<div>
    <form:form modelAttribute="RF">
    <div class="form-group">
        <label for="inputEmail1" class="col-sm-4 control-label">Nouveau numero</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="route.Numero" type="text" class="form-control" id="inputEmail1" placeholder="Nom de la ville" />
        </div>
    </div>
		<table class="table table-striped ">
    		<caption class="text-center">Ajouter la derniere ville</caption>
    		<thead>
        		<tr>
            		<th>Ville</th>
            
        		</tr>
    		</thead>
    		<tfoot>
        		<tr>
            		<td class="text-center" colspan="5">inserer la derniere ville</td>
        		</tr>
    		</tfoot>
    		<tbody>

    		 		<tr>
    		 			<td>
    		 				<form:select path="RF.IdVille">
    		 					<form:options items="${ villes }" itemLabel="Nom" itemValue="IdVille" />
    		 				</form:select>
    		 			</td>
    		 		</tr>

    		</tbody>

		</table>
		<form:input path="Route.IdRoute" value="${RF.getRoute().getIdRoute()}" type="hidden" />
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-20">
            <button type="submit" class="btn btn-primary"><i class="icon icon-check icon-lg"></i> Valider </button>
        </div>
    </div>	
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>