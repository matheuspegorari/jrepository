package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InstanciaAtividade extends AbstractSankhyaEntity<InstanciaAtividade> {
   private BigDecimal codUsu;
   private String statusInstCicloContQual;
   private String nroLote;
   private String multiProduto;
   private String codVolPa;
   private BigDecimal qtdProduzir;
   private String descrProdPa;
   private Timestamp dhFinPrev;
   private Timestamp dhIniPrev;
   private Timestamp dhInclusao;
   private String descrGrupoProdPa;
   private BigDecimal codParcterc;
   private BigDecimal codProdPa;
   private BigDecimal prioridade;
   private BigDecimal codGrupoProdPa;
   private String complDescPa;
   private String situacao;
   private String controlePa;
   private String referencia;
   private BigDecimal codExec;
   private BigDecimal codWcp;
   private Timestamp dhAceite;
   private Timestamp dhFinal;
   private Timestamp dhInicio;
   private BigDecimal idEfx;
   private String idExecWflow;
   private BigDecimal idIatv;
   private BigDecimal idIproc;
   private BigDecimal tempoGastoMin;
   private BigDecimal codMtp;
   private BigDecimal codUltExec;
   private BigDecimal codUsuFin;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getStatusInstCicloContQual() {
        return statusInstCicloContQual;
   }

   public void setStatusInstCicloContQual(String statusInstCicloContQual) {
        markAsChanged("STATUSINSTCICLOCONTQUAL", statusInstCicloContQual);
        this.statusInstCicloContQual = statusInstCicloContQual;
   }

   public String getNroLote() {
        return nroLote;
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
        this.nroLote = nroLote;
   }

   public String getMultiProduto() {
        return multiProduto;
   }

   public void setMultiProduto(String multiProduto) {
        markAsChanged("MULTIPRODUTO", multiProduto);
        this.multiProduto = multiProduto;
   }

   public String getCodVolPa() {
        return codVolPa;
   }

   public void setCodVolPa(String codVolPa) {
        markAsChanged("CODVOLPA", codVolPa);
        this.codVolPa = codVolPa;
   }

   public BigDecimal getQtdProduzir() {
        return qtdProduzir;
   }

   public void setQtdProduzir(BigDecimal qtdProduzir) {
        markAsChanged("QTDPRODUZIR", qtdProduzir);
        this.qtdProduzir = qtdProduzir;
   }

   public String getDescrProdPa() {
        return descrProdPa;
   }

   public void setDescrProdPa(String descrProdPa) {
        markAsChanged("DESCRPRODPA", descrProdPa);
        this.descrProdPa = descrProdPa;
   }

   public Timestamp getDhFinPrev() {
        return dhFinPrev;
   }

   public void setDhFinPrev(Timestamp dhFinPrev) {
        markAsChanged("DHFINPREV", dhFinPrev);
        this.dhFinPrev = dhFinPrev;
   }

   public Timestamp getDhIniPrev() {
        return dhIniPrev;
   }

   public void setDhIniPrev(Timestamp dhIniPrev) {
        markAsChanged("DHINIPREV", dhIniPrev);
        this.dhIniPrev = dhIniPrev;
   }

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
        this.dhInclusao = dhInclusao;
   }

   public String getDescrGrupoProdPa() {
        return descrGrupoProdPa;
   }

   public void setDescrGrupoProdPa(String descrGrupoProdPa) {
        markAsChanged("DESCRGRUPOPRODPA", descrGrupoProdPa);
        this.descrGrupoProdPa = descrGrupoProdPa;
   }

   public BigDecimal getCodParcterc() {
        return codParcterc;
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
        this.codParcterc = codParcterc;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getCodGrupoProdPa() {
        return codGrupoProdPa;
   }

   public void setCodGrupoProdPa(BigDecimal codGrupoProdPa) {
        markAsChanged("CODGRUPOPRODPA", codGrupoProdPa);
        this.codGrupoProdPa = codGrupoProdPa;
   }

   public String getComplDescPa() {
        return complDescPa;
   }

   public void setComplDescPa(String complDescPa) {
        markAsChanged("COMPLDESCPA", complDescPa);
        this.complDescPa = complDescPa;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
        this.codExec = codExec;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public Timestamp getDhAceite() {
        return dhAceite;
   }

   public void setDhAceite(Timestamp dhAceite) {
        markAsChanged("DHACEITE", dhAceite);
        this.dhAceite = dhAceite;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
        this.dhFinal = dhFinal;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
        this.dhInicio = dhInicio;
   }

   public BigDecimal getIdEfx() {
        return idEfx;
   }

   public void setIdEfx(BigDecimal idEfx) {
        markAsChanged("IDEFX", idEfx);
        this.idEfx = idEfx;
   }

   public String getIdExecWflow() {
        return idExecWflow;
   }

   public void setIdExecWflow(String idExecWflow) {
        markAsChanged("IDEXECWFLOW", idExecWflow);
        this.idExecWflow = idExecWflow;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
        this.idIatv = idIatv;
   }

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public BigDecimal getTempoGastoMin() {
        return tempoGastoMin;
   }

   public void setTempoGastoMin(BigDecimal tempoGastoMin) {
        markAsChanged("TEMPOGASTOMIN", tempoGastoMin);
        this.tempoGastoMin = tempoGastoMin;
   }

   public BigDecimal getCodMtp() {
        return codMtp;
   }

   public void setCodMtp(BigDecimal codMtp) {
        markAsChanged("CODMTP", codMtp);
        this.codMtp = codMtp;
   }

   public BigDecimal getCodUltExec() {
        return codUltExec;
   }

   public void setCodUltExec(BigDecimal codUltExec) {
        markAsChanged("CODULTEXEC", codUltExec);
        this.codUltExec = codUltExec;
   }

   public BigDecimal getCodUsuFin() {
        return codUsuFin;
   }

   public void setCodUsuFin(BigDecimal codUsuFin) {
        markAsChanged("CODUSUFIN", codUsuFin);
        this.codUsuFin = codUsuFin;
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
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.statusInstCicloContQual = vo.asString("STATUSINSTCICLOCONTQUAL");
        this.nroLote = vo.asString("NROLOTE");
        this.multiProduto = vo.asString("MULTIPRODUTO");
        this.codVolPa = vo.asString("CODVOLPA");
        this.qtdProduzir = vo.asBigDecimal("QTDPRODUZIR");
        this.descrProdPa = vo.asString("DESCRPRODPA");
        this.dhFinPrev = vo.asTimestamp("DHFINPREV");
        this.dhIniPrev = vo.asTimestamp("DHINIPREV");
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.descrGrupoProdPa = vo.asString("DESCRGRUPOPRODPA");
        this.codParcterc = vo.asBigDecimal("CODPARCTERC");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.codGrupoProdPa = vo.asBigDecimal("CODGRUPOPRODPA");
        this.complDescPa = vo.asString("COMPLDESCPA");
        this.situacao = vo.asString("SITUACAO");
        this.controlePa = vo.asString("CONTROLEPA");
        this.referencia = vo.asString("REFERENCIA");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.dhAceite = vo.asTimestamp("DHACEITE");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.idEfx = vo.asBigDecimal("IDEFX");
        this.idExecWflow = vo.asString("IDEXECWFLOW");
        this.idIatv = vo.asBigDecimal("IDIATV");
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.tempoGastoMin = vo.asBigDecimal("TEMPOGASTOMIN");
        this.codMtp = vo.asBigDecimal("CODMTP");
        this.codUltExec = vo.asBigDecimal("CODULTEXEC");
        this.codUsuFin = vo.asBigDecimal("CODUSUFIN");
        return this;
   }
}
