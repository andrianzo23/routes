<%@ include file="common/header.jspf"%>	<div class="col-sm-4 col-xs-2">
<div>
	<div>
		<h4 class="text-center text-primary">Insertion d'une ville</h4>
	</div>
<form:form modelAttribute="ville" class="form-horizontal" role="form" name="form" action="" method="post">
    <div class="form-group">
        <label for="inputEmail1" class="col-sm-4 control-label">Nom</label>
        <div class="col-sm-4 col-xs-2">
            <form:input path="Nom" type="text" class="form-control" id="inputEmail1" placeholder="Nom de la ville" />
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