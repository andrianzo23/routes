<%@ include file="common/header.jspf"%>	<div class="col-sm-4 col-xs-2">
<div>
	<div>
		<h4 class="text-center text-primary">Insertion d'une route</h4>
	</div>
<form:form modelAttribute="portion" class="form-horizontal" role="form" name="form" action="" method="post">
    <div class="form-group">
        <label for="inputEmail1" class="col-sm-4 control-label">debut(pk)</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="Debut" type="text" class="form-control" id="inputEmail1" placeholder="Nom de la ville" />
        </div>
    </div>
        <div class="form-group">
        <label for="inputEmail2" class="col-sm-4 control-label">fin(pk)</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="Fin" type="text" class="form-control" id="inputEmail2" placeholder="fin(ex:2)" />
        </div>
    </div>
    <div>
        <div class="form-group">
        <label for="inputEmail2" class="col-sm-4 control-label">route</label>
        <div class="col-sm-4 col-xs-2">
			<form:select path="IdRoute">
				<form:options items="${ routes }" itemLabel="Numero" itemValue="IdRoute" />
    		</form:select>
        </div>
        </div>
    </div>
    </div>
        <div class="form-group">
        <label for="inputEmail3" class="col-sm-4 control-label">etat</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="Etat" type="text" class="form-control" id="inputEmail3" placeholder="1-4" />
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-20">
            <button type="submit" class="btn btn-primary"><i class="icon icon-check icon-lg"></i> Valider</button>
        </div>
    </div>
</form:form>
</div>
<%@ include file="common/footer.jspf"%>