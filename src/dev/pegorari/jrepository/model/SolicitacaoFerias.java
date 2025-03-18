package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SolicitacaoFerias extends AbstractSankhyaEntity<SolicitacaoFerias> {
   private BigDecimal diasAbonoPec;
   private BigDecimal id;
   private Timestamp dtIniAqui;
   private BigDecimal seqFer;
   private String observacao;
   private String abonoPecUniario;
   private BigDecimal codFunc;
   private BigDecimal codEmp;
   private Timestamp dhSolicit;
   private BigDecimal nuSolicit;
   private Timestamp prevInicio;
   private String status;
   private BigDecimal diasSolicitados;

   public BigDecimal getDiasAbonoPec() {
        return diasAbonoPec;
   }

   public void setDiasAbonoPec(BigDecimal diasAbonoPec) {
        markAsChanged("DIASABONOPEC", diasAbonoPec);
        this.diasAbonoPec = diasAbonoPec;
   }

   public BigDecimal getId() {
        return id;
   }

   public void setId(BigDecimal id) {
        markAsChanged("ID", id);
        this.id = id;
   }

   public Timestamp getDtIniAqui() {
        return dtIniAqui;
   }

   public void setDtIniAqui(Timestamp dtIniAqui) {
        markAsChanged("DTINIAQUI", dtIniAqui);
        this.dtIniAqui = dtIniAqui;
   }

   public BigDecimal getSeqFer() {
        return seqFer;
   }

   public void setSeqFer(BigDecimal seqFer) {
        markAsChanged("SEQFER", seqFer);
        this.seqFer = seqFer;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getAbonoPecUniario() {
        return abonoPecUniario;
   }

   public void setAbonoPecUniario(String abonoPecUniario) {
        markAsChanged("ABONOPECUNIARIO", abonoPecUniario);
        this.abonoPecUniario = abonoPecUniario;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDhSolicit() {
        return dhSolicit;
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
        this.dhSolicit = dhSolicit;
   }

   public BigDecimal getNuSolicit() {
        return nuSolicit;
   }

   public void setNuSolicit(BigDecimal nuSolicit) {
        markAsChanged("NUSOLICIT", nuSolicit);
        this.nuSolicit = nuSolicit;
   }

   public Timestamp getPrevInicio() {
        return prevInicio;
   }

   public void setPrevInicio(Timestamp prevInicio) {
        markAsChanged("PREVINICIO", prevInicio);
        this.prevInicio = prevInicio;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getDiasSolicitados() {
        return diasSolicitados;
   }

   public void setDiasSolicitados(BigDecimal diasSolicitados) {
        markAsChanged("DIASSOLICITADOS", diasSolicitados);
        this.diasSolicitados = diasSolicitados;
   }

   @Override
   public String getTableName() {
        return "TFPSFE";
   }

   @Override
   public String getEntityName() {
        return "SolicitacaoFerias";
   }

   @Override
   public SolicitacaoFerias fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.diasAbonoPec = vo.asBigDecimal("DIASABONOPEC");
        this.id = vo.asBigDecimal("ID");
        this.dtIniAqui = vo.asTimestamp("DTINIAQUI");
        this.seqFer = vo.asBigDecimal("SEQFER");
        this.observacao = vo.asString("OBSERVACAO");
        this.abonoPecUniario = vo.asString("ABONOPECUNIARIO");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dhSolicit = vo.asTimestamp("DHSOLICIT");
        this.nuSolicit = vo.asBigDecimal("NUSOLICIT");
        this.prevInicio = vo.asTimestamp("PREVINICIO");
        this.status = vo.asString("STATUS");
        this.diasSolicitados = vo.asBigDecimal("DIASSOLICITADOS");
        return this;
   }
}
