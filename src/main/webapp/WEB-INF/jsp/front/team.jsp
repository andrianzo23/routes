<%@ include file="common/header.jspf"%>

            <!-- Team Start -->
            <div class="team">
                <div class="container">
                    <div class="section-header text-center">
                        <p>All the roads</p>
                        <h2>all about Mada's national road</h2>
                    </div>
                    <div class="row">
                       <c:forEach items="${routes}" var="route">
                        <div class="col-lg-3 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                            <div class="team-item">
                                <div class="team-img">
                                    <img src="img/team-1.jpg" alt="Team Image">
                                </div>
                                <div class="team-text"><a href="/front-details-route?id=${route.pRoute.getId_Route()}">
                                    <h2>${ route.pRoute.getNumero() }</h2>
                                    <p>${ route.pRoute.debut } - ${ route.pRoute.getFin() }</p>
                                </a>
                                </div>
                                <div class="team-social">
                                     <c:forEach items="${ route.villes }" var="ville">
                                    	<a class="social-tw" href="">${ ville.getNom() }</a>
									</c:forEach>
									<a class="social-tw " href="">${ route.pRoute.getFin() }</a>

                                </div>
                            </div>
                        </div>
                       </c:forEach>
                    </div>
                </div>
            </div>
            <!-- Team End -->

<%@ include file="common/footer.jspf"%>