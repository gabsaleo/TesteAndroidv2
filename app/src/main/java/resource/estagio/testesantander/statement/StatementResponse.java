package resource.estagio.testesantander.statement;

import java.util.List;

import resource.estagio.testesantander.model.Error;
import resource.estagio.testesantander.model.Statement;

public class StatementResponse {
    private List<Statement> statementList;

    private Error error;

    public StatementResponse(Error error, List<Statement> statementList) {
        this.error = error;
        this.statementList = statementList;
    }


    public Error getError() {
        return error;
    }// pega o erro

    public List<Statement> getStatementList() {
        return statementList;
    } // pego a lista de statement

}
