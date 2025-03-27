package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RequisicaoPessoal extends AbstractSankhyaEntity<RequisicaoPessoal> {
   public String getStatusAval() {
        return this.getVo().asString("STATUSAVAL");
   }

   public void setStatusAval(String statusAval) {
        markAsChanged("STATUSAVAL", statusAval);
   }

   public BigDecimal getStatusSelecao() {
        return this.getVo().asBigDecimal("STATUSSELECAO");
   }

   public void setStatusSelecao(BigDecimal statusSelecao) {
        markAsChanged("STATUSSELECAO", statusSelecao);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getTipoSelecao() {
        return this.getVo().asBigDecimal("TIPOSELECAO");
   }

   public void setTipoSelecao(BigDecimal tipoSelecao) {
        markAsChanged("TIPOSELECAO", tipoSelecao);
   }

   public String getTipVaga() {
        return this.getVo().asString("TIPVAGA");
   }

   public void setTipVaga(String tipVaga) {
        markAsChanged("TIPVAGA", tipVaga);
   }

   public BigDecimal getVinculo() {
        return this.getVo().asBigDecimal("VINCULO");
   }

   public void setVinculo(BigDecimal vinculo) {
        markAsChanged("VINCULO", vinculo);
   }

   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMotivo() {
        return this.getVo().asBigDecimal("CODMOTIVO");
   }

   public void setCodMotivo(BigDecimal codMotivo) {
        markAsChanged("CODMOTIVO", codMotivo);
   }

   public BigDecimal getCodMotivoAval() {
        return this.getVo().asBigDecimal("CODMOTIVOAVAL");
   }

   public void setCodMotivoAval(BigDecimal codMotivoAval) {
        markAsChanged("CODMOTIVOAVAL", codMotivoAval);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuAval() {
        return this.getVo().asBigDecimal("CODUSUAVAL");
   }

   public void setCodUsuAval(BigDecimal codUsuAval) {
        markAsChanged("CODUSUAVAL", codUsuAval);
   }

   public BigDecimal getCodUsuRequisitante() {
        return this.getVo().asBigDecimal("CODUSUREQUISITANTE");
   }

   public void setCodUsuRequisitante(BigDecimal codUsuRequisitante) {
        markAsChanged("CODUSUREQUISITANTE", codUsuRequisitante);
   }

   public String getDescrRequisicao() {
        return this.getVo().asString("DESCRREQUISICAO");
   }

   public void setDescrRequisicao(String descrRequisicao) {
        markAsChanged("DESCRREQUISICAO", descrRequisicao);
   }

   public Timestamp getDhAvaliacao() {
        return this.getVo().asTimestamp("DHAVALIACAO");
   }

   public void setDhAvaliacao(Timestamp dhAvaliacao) {
        markAsChanged("DHAVALIACAO", dhAvaliacao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtPrevAtend() {
        return this.getVo().asTimestamp("DTPREVATEND");
   }

   public void setDtPrevAtend(Timestamp dtPrevAtend) {
        markAsChanged("DTPREVATEND", dtPrevAtend);
   }

   public Timestamp getDtRequisicao() {
        return this.getVo().asTimestamp("DTREQUISICAO");
   }

   public void setDtRequisicao(Timestamp dtRequisicao) {
        markAsChanged("DTREQUISICAO", dtRequisicao);
   }

   public BigDecimal getFimFaixSal() {
        return this.getVo().asBigDecimal("FIMFAIXSAL");
   }

   public void setFimFaixSal(BigDecimal fimFaixSal) {
        markAsChanged("FIMFAIXSAL", fimFaixSal);
   }

   public BigDecimal getGrauInstr() {
        return this.getVo().asBigDecimal("GRAUINSTR");
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        markAsChanged("GRAUINSTR", grauInstr);
   }

   public BigDecimal getIniFaixSal() {
        return this.getVo().asBigDecimal("INIFAIXSAL");
   }

   public void setIniFaixSal(BigDecimal iniFaixSal) {
        markAsChanged("INIFAIXSAL", iniFaixSal);
   }

   public String getJustificativa() {
        return this.getVo().asString("JUSTIFICATIVA");
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public String getObsAvaliacao() {
        return this.getVo().asString("OBSAVALIACAO");
   }

   public void setObsAvaliacao(String obsAvaliacao) {
        markAsChanged("OBSAVALIACAO", obsAvaliacao);
   }

   public String getObsCargo() {
        return this.getVo().asString("OBSCARGO");
   }

   public void setObsCargo(String obsCargo) {
        markAsChanged("OBSCARGO", obsCargo);
   }

   public String getPermiteExFunc() {
        return this.getVo().asString("PERMITEEXFUNC");
   }

   public void setPermiteExFunc(String permiteExFunc) {
        markAsChanged("PERMITEEXFUNC", permiteExFunc);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getQtdVagas() {
        return this.getVo().asBigDecimal("QTDVAGAS");
   }

   public void setQtdVagas(BigDecimal qtdVagas) {
        markAsChanged("QTDVAGAS", qtdVagas);
   }

   public BigDecimal getQtdVagasAtend() {
        return this.getVo().asBigDecimal("QTDVAGASATEND");
   }

   public void setQtdVagasAtend(BigDecimal qtdVagasAtend) {
        markAsChanged("QTDVAGASATEND", qtdVagasAtend);
   }

   public BigDecimal getSitRequisicao() {
        return this.getVo().asBigDecimal("SITREQUISICAO");
   }

   public void setSitRequisicao(BigDecimal sitRequisicao) {
        markAsChanged("SITREQUISICAO", sitRequisicao);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   @Override
   public String getTableName() {
        return "TRSREQ";
   }

   @Override
   public String getEntityName() {
        return "RequisicaoPessoal";
   }

   @Override
   public RequisicaoPessoal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
