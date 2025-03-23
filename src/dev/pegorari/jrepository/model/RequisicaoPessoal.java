package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RequisicaoPessoal extends AbstractSankhyaEntity<RequisicaoPessoal> {
   private String statusAval;
   private BigDecimal statusSelecao;
   private BigDecimal tipo;
   private BigDecimal tipoSelecao;
   private String tipVaga;
   private BigDecimal vinculo;
   private BigDecimal codCargaHor;
   private BigDecimal codCargo;
   private BigDecimal codDep;
   private BigDecimal codEmp;
   private BigDecimal codMotivo;
   private BigDecimal codMotivoAval;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private BigDecimal codUsuAval;
   private BigDecimal codUsuRequisitante;
   private String descrRequisicao;
   private Timestamp dhAvaliacao;
   private Timestamp dtAlter;
   private Timestamp dtPrevAtend;
   private Timestamp dtRequisicao;
   private BigDecimal fimFaixSal;
   private BigDecimal grauInstr;
   private BigDecimal iniFaixSal;
   private String justificativa;
   private BigDecimal nuRequisicao;
   private String obs;
   private String obsAvaliacao;
   private String obsCargo;
   private String permiteExFunc;
   private BigDecimal prioridade;
   private BigDecimal qtdVagas;
   private BigDecimal qtdVagasAtend;
   private BigDecimal sitRequisicao;
   private String status;

   public String getStatusAval() {
        return statusAval;
   }

   public void setStatusAval(String statusAval) {
        markAsChanged("STATUSAVAL", statusAval);
        this.statusAval = statusAval;
   }

   public BigDecimal getStatusSelecao() {
        return statusSelecao;
   }

   public void setStatusSelecao(BigDecimal statusSelecao) {
        markAsChanged("STATUSSELECAO", statusSelecao);
        this.statusSelecao = statusSelecao;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getTipoSelecao() {
        return tipoSelecao;
   }

   public void setTipoSelecao(BigDecimal tipoSelecao) {
        markAsChanged("TIPOSELECAO", tipoSelecao);
        this.tipoSelecao = tipoSelecao;
   }

   public String getTipVaga() {
        return tipVaga;
   }

   public void setTipVaga(String tipVaga) {
        markAsChanged("TIPVAGA", tipVaga);
        this.tipVaga = tipVaga;
   }

   public BigDecimal getVinculo() {
        return vinculo;
   }

   public void setVinculo(BigDecimal vinculo) {
        markAsChanged("VINCULO", vinculo);
        this.vinculo = vinculo;
   }

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
        this.codCargo = codCargo;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
        this.codDep = codDep;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMotivo() {
        return codMotivo;
   }

   public void setCodMotivo(BigDecimal codMotivo) {
        markAsChanged("CODMOTIVO", codMotivo);
        this.codMotivo = codMotivo;
   }

   public BigDecimal getCodMotivoAval() {
        return codMotivoAval;
   }

   public void setCodMotivoAval(BigDecimal codMotivoAval) {
        markAsChanged("CODMOTIVOAVAL", codMotivoAval);
        this.codMotivoAval = codMotivoAval;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuAval() {
        return codUsuAval;
   }

   public void setCodUsuAval(BigDecimal codUsuAval) {
        markAsChanged("CODUSUAVAL", codUsuAval);
        this.codUsuAval = codUsuAval;
   }

   public BigDecimal getCodUsuRequisitante() {
        return codUsuRequisitante;
   }

   public void setCodUsuRequisitante(BigDecimal codUsuRequisitante) {
        markAsChanged("CODUSUREQUISITANTE", codUsuRequisitante);
        this.codUsuRequisitante = codUsuRequisitante;
   }

   public String getDescrRequisicao() {
        return descrRequisicao;
   }

   public void setDescrRequisicao(String descrRequisicao) {
        markAsChanged("DESCRREQUISICAO", descrRequisicao);
        this.descrRequisicao = descrRequisicao;
   }

   public Timestamp getDhAvaliacao() {
        return dhAvaliacao;
   }

   public void setDhAvaliacao(Timestamp dhAvaliacao) {
        markAsChanged("DHAVALIACAO", dhAvaliacao);
        this.dhAvaliacao = dhAvaliacao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtPrevAtend() {
        return dtPrevAtend;
   }

   public void setDtPrevAtend(Timestamp dtPrevAtend) {
        markAsChanged("DTPREVATEND", dtPrevAtend);
        this.dtPrevAtend = dtPrevAtend;
   }

   public Timestamp getDtRequisicao() {
        return dtRequisicao;
   }

   public void setDtRequisicao(Timestamp dtRequisicao) {
        markAsChanged("DTREQUISICAO", dtRequisicao);
        this.dtRequisicao = dtRequisicao;
   }

   public BigDecimal getFimFaixSal() {
        return fimFaixSal;
   }

   public void setFimFaixSal(BigDecimal fimFaixSal) {
        markAsChanged("FIMFAIXSAL", fimFaixSal);
        this.fimFaixSal = fimFaixSal;
   }

   public BigDecimal getGrauInstr() {
        return grauInstr;
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        markAsChanged("GRAUINSTR", grauInstr);
        this.grauInstr = grauInstr;
   }

   public BigDecimal getIniFaixSal() {
        return iniFaixSal;
   }

   public void setIniFaixSal(BigDecimal iniFaixSal) {
        markAsChanged("INIFAIXSAL", iniFaixSal);
        this.iniFaixSal = iniFaixSal;
   }

   public String getJustificativa() {
        return justificativa;
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
        this.justificativa = justificativa;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public String getObsAvaliacao() {
        return obsAvaliacao;
   }

   public void setObsAvaliacao(String obsAvaliacao) {
        markAsChanged("OBSAVALIACAO", obsAvaliacao);
        this.obsAvaliacao = obsAvaliacao;
   }

   public String getObsCargo() {
        return obsCargo;
   }

   public void setObsCargo(String obsCargo) {
        markAsChanged("OBSCARGO", obsCargo);
        this.obsCargo = obsCargo;
   }

   public String getPermiteExFunc() {
        return permiteExFunc;
   }

   public void setPermiteExFunc(String permiteExFunc) {
        markAsChanged("PERMITEEXFUNC", permiteExFunc);
        this.permiteExFunc = permiteExFunc;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getQtdVagas() {
        return qtdVagas;
   }

   public void setQtdVagas(BigDecimal qtdVagas) {
        markAsChanged("QTDVAGAS", qtdVagas);
        this.qtdVagas = qtdVagas;
   }

   public BigDecimal getQtdVagasAtend() {
        return qtdVagasAtend;
   }

   public void setQtdVagasAtend(BigDecimal qtdVagasAtend) {
        markAsChanged("QTDVAGASATEND", qtdVagasAtend);
        this.qtdVagasAtend = qtdVagasAtend;
   }

   public BigDecimal getSitRequisicao() {
        return sitRequisicao;
   }

   public void setSitRequisicao(BigDecimal sitRequisicao) {
        markAsChanged("SITREQUISICAO", sitRequisicao);
        this.sitRequisicao = sitRequisicao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
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
        this.statusAval = vo.asString("STATUSAVAL");
        this.statusSelecao = vo.asBigDecimal("STATUSSELECAO");
        this.tipo = vo.asBigDecimal("TIPO");
        this.tipoSelecao = vo.asBigDecimal("TIPOSELECAO");
        this.tipVaga = vo.asString("TIPVAGA");
        this.vinculo = vo.asBigDecimal("VINCULO");
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMotivo = vo.asBigDecimal("CODMOTIVO");
        this.codMotivoAval = vo.asBigDecimal("CODMOTIVOAVAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuAval = vo.asBigDecimal("CODUSUAVAL");
        this.codUsuRequisitante = vo.asBigDecimal("CODUSUREQUISITANTE");
        this.descrRequisicao = vo.asString("DESCRREQUISICAO");
        this.dhAvaliacao = vo.asTimestamp("DHAVALIACAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtPrevAtend = vo.asTimestamp("DTPREVATEND");
        this.dtRequisicao = vo.asTimestamp("DTREQUISICAO");
        this.fimFaixSal = vo.asBigDecimal("FIMFAIXSAL");
        this.grauInstr = vo.asBigDecimal("GRAUINSTR");
        this.iniFaixSal = vo.asBigDecimal("INIFAIXSAL");
        this.justificativa = vo.asString("JUSTIFICATIVA");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.obs = vo.asString("OBS");
        this.obsAvaliacao = vo.asString("OBSAVALIACAO");
        this.obsCargo = vo.asString("OBSCARGO");
        this.permiteExFunc = vo.asString("PERMITEEXFUNC");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.qtdVagas = vo.asBigDecimal("QTDVAGAS");
        this.qtdVagasAtend = vo.asBigDecimal("QTDVAGASATEND");
        this.sitRequisicao = vo.asBigDecimal("SITREQUISICAO");
        this.status = vo.asString("STATUS");
        return this;
   }
}
