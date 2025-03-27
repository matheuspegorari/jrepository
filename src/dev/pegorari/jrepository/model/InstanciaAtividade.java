package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaAtividade extends AbstractSankhyaEntity<InstanciaAtividade> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getStatusInstCicloContQual() {
        return this.getVo().asString("STATUSINSTCICLOCONTQUAL");
   }

   public void setStatusInstCicloContQual(String statusInstCicloContQual) {
        markAsChanged("STATUSINSTCICLOCONTQUAL", statusInstCicloContQual);
   }

   public String getNroLote() {
        return this.getVo().asString("NROLOTE");
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
   }

   public String getMultiProduto() {
        return this.getVo().asString("MULTIPRODUTO");
   }

   public void setMultiProduto(String multiProduto) {
        markAsChanged("MULTIPRODUTO", multiProduto);
   }

   public String getCodVolPa() {
        return this.getVo().asString("CODVOLPA");
   }

   public void setCodVolPa(String codVolPa) {
        markAsChanged("CODVOLPA", codVolPa);
   }

   public BigDecimal getQtdProduzir() {
        return this.getVo().asBigDecimal("QTDPRODUZIR");
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        markAsChanged("QTDPRODUZIR", qtdProduzir);
   }

   public String getDescrProdPa() {
        return this.getVo().asString("DESCRPRODPA");
   }

   public void setDescrProdPa(String descrProdPa) {
        markAsChanged("DESCRPRODPA", descrProdPa);
   }

   public Timestamp getDhFinPrev() {
        return this.getVo().asTimestamp("DHFINPREV");
   }

   public void setDhFinPrev(Timestamp dhFinPrev) {
        markAsChanged("DHFINPREV", dhFinPrev);
   }

   public Timestamp getDhIniPrev() {
        return this.getVo().asTimestamp("DHINIPREV");
   }

   public void setDhIniPrev(Timestamp dhIniPrev) {
        markAsChanged("DHINIPREV", dhIniPrev);
   }

   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public String getDescrGrupoProdPa() {
        return this.getVo().asString("DESCRGRUPOPRODPA");
   }

   public void setDescrGrupoProdPa(String descrGrupoProdPa) {
        markAsChanged("DESCRGRUPOPRODPA", descrGrupoProdPa);
   }

   public BigDecimal getCodParcterc() {
        return this.getVo().asBigDecimal("CODPARCTERC");
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getCodGrupoProdPa() {
        return this.getVo().asBigDecimal("CODGRUPOPRODPA");
   }

   public void setCodGrupoProdPa(BigDecimal codGrupoProdPa) {
        markAsChanged("CODGRUPOPRODPA", codGrupoProdPa);
   }

   public String getComplDescPa() {
        return this.getVo().asString("COMPLDESCPA");
   }

   public void setComplDescPa(String complDescPa) {
        markAsChanged("COMPLDESCPA", complDescPa);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public Timestamp getDhAceite() {
        return this.getVo().asTimestamp("DHACEITE");
   }

   public void setDhAceite(Timestamp dhAceite) {
        markAsChanged("DHACEITE", dhAceite);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public Timestamp getDhInicio() {
        return this.getVo().asTimestamp("DHINICIO");
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
   }

   public BigDecimal getIdEfx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdEfx(BigDecimal idEfx) {
        markAsChanged("IDEFX", idEfx);
   }

   public String getIdExecWflow() {
        return this.getVo().asString("IDEXECWFLOW");
   }

   public void setIdExecWflow(String idExecWflow) {
        markAsChanged("IDEXECWFLOW", idExecWflow);
   }

   public BigDecimal getIdIatv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getTempoGastoMin() {
        return this.getVo().asBigDecimal("TEMPOGASTOMIN");
   }

   public void setTempoGastoMin(BigDecimal tempoGastoMin) {
        markAsChanged("TEMPOGASTOMIN", tempoGastoMin);
   }

   public BigDecimal getCodMtp() {
        return this.getVo().asBigDecimal("CODMTP");
   }

   public void setCodMtp(BigDecimal codMtp) {
        markAsChanged("CODMTP", codMtp);
   }

   public BigDecimal getCodUltExec() {
        return this.getVo().asBigDecimal("CODULTEXEC");
   }

   public void setCodUltExec(BigDecimal codUltExec) {
        markAsChanged("CODULTEXEC", codUltExec);
   }

   public BigDecimal getCodUsuFin() {
        return this.getVo().asBigDecimal("CODUSUFIN");
   }

   public void setCodUsuFin(BigDecimal codUsuFin) {
        markAsChanged("CODUSUFIN", codUsuFin);
   }

   @Override
   public String getTableName() {
        return "TPRIATV";
   }

   @Override
   public String getEntityName() {
        return "InstanciaAtividade";
   }

   @Override
   public InstanciaAtividade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
