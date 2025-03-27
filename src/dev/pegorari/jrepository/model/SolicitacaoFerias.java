package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SolicitacaoFerias extends AbstractSankhyaEntity<SolicitacaoFerias> {
   public BigDecimal getDiasAbonoPec() {
        return this.getVo().asBigDecimal("DIASABONOPEC");
   }

   public void setDiasAbonoPec(BigDecimal diasAbonoPec) {
        markAsChanged("DIASABONOPEC", diasAbonoPec);
   }

   public BigDecimal getId() {
        return this.getVo().asBigDecimal("ID");
   }

   public void setId(BigDecimal id) {
        markAsChanged("ID", id);
   }

   public Timestamp getDtIniAqui() {
        return this.getVo().asTimestamp("DTINIAQUI");
   }

   public void setDtIniAqui(Timestamp dtIniAqui) {
        markAsChanged("DTINIAQUI", dtIniAqui);
   }

   public BigDecimal getSeqFer() {
        return this.getVo().asBigDecimal("SEQFER");
   }

   public void setSeqFer(BigDecimal seqFer) {
        markAsChanged("SEQFER", seqFer);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getAbonoPecUniario() {
        return this.getVo().asString("ABONOPECUNIARIO");
   }

   public void setAbonoPecUniario(String abonoPecUniario) {
        markAsChanged("ABONOPECUNIARIO", abonoPecUniario);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDhSolicit() {
        return this.getVo().asTimestamp("DHSOLICIT");
   }

   public void setDhSolicit(Timestamp dhSolicit) {
        markAsChanged("DHSOLICIT", dhSolicit);
   }

   public BigDecimal getNuSolicit() {
        return this.getVo().asBigDecimal("NUSOLICIT");
   }

   public void setNuSolicit(BigDecimal nuSolicit) {
        markAsChanged("NUSOLICIT", nuSolicit);
   }

   public Timestamp getPrevInicio() {
        return this.getVo().asTimestamp("PREVINICIO");
   }

   public void setPrevInicio(Timestamp prevInicio) {
        markAsChanged("PREVINICIO", prevInicio);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getDiasSolicitados() {
        return this.getVo().asBigDecimal("DIASSOLICITADOS");
   }

   public void setDiasSolicitados(BigDecimal diasSolicitados) {
        markAsChanged("DIASSOLICITADOS", diasSolicitados);
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
        this.setVo(vo);
        return this;
   }
}
