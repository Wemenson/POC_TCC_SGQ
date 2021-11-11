var response = connector.getVariable("response");
var date = connector.getVariable("date");

// parse response variable with camunda-spin
var incidentes = S(response);

var query = "$..[?(@.datum=='" + date + "')]";

// use camunda-spin jsonPath to test if date is a holiday
incidentes.jsonPath(query).elementList().isEmpty();