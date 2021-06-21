<%@ include file="common/header.jspf"%>	<div class="col-sm-4 col-xs-2">
<div>
    <form:form modelAttribute="rvs">
    <div class="form-group">
        <label for="inputEmail1" class="col-sm-4 control-label">Nouveau nom</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="NomVille" type="text" class="form-control" id="inputEmail1" placeholder="Nom de la ville" />
        </div>
    </div>
		<table class="table table-striped ">
    		<caption class="text-center">Ajouter Affiliation route-ville</caption>
    		<thead>
        		<tr>
            		<th>Route</th>
            		<th>Pk</th>
            
        		</tr>
    		</thead>
    		<tfoot>
        		<tr>
            		<td class="text-center" colspan="5">inserer les affiliations au dessus</td>
        		</tr>
    		</tfoot>
    		<tbody>

				<c:forEach items="${rvs.RVs}" var="rv" varStatus="tagStatus">
    		 		<tr>
    		 			<td>
    		 				<form:select path="RVs[${tagStatus.index}].RV.IdRoute">
    		 					<form:options items="${ routes }" itemLabel="Numero" itemValue="IdRoute" />
    		 				</form:select>
    		 			</td>
    		 			<td>
    		 				<form:input path="RVs[${tagStatus.index}].RV.Pk"/>
    		 			</td>
    		 			<td>
	    		 			<form:radiobutton path="RVs[${tagStatus.index}].Valide" value="1"/>
    		 			</td>
    		 		</tr>
    		 	</c:forEach>

    		</tbody>

		</table>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-20">
            <button type="submit" class="btn btn-primary"><i class="icon icon-check icon-lg"></i> Valider </button>
        </div>
    </div>	
	</form:form>
</div>
<%@ include file="common/footer.jspf"%>