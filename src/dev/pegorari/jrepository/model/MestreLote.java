package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MestreLote extends AbstractSankhyaEntity<MestreLote> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComentarios() {
        return this.getVo().asString("COMENTARIOS");
   }

   public void setComentarios(String comentarios) {
        markAsChanged("COMENTARIOS", comentarios);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public BigDecimal getNumLote() {
        return this.getVo().asBigDecimal("NUMLOTE");
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public BigDecimal getTotLote() {
        return this.getVo().asBigDecimal("TOTLOTE");
   }

   public void setTotLote(BigDecimal totLote) {
        markAsChanged("TOTLOTE", totLote);
   }

   public BigDecimal getUltLanc() {
        return this.getVo().asBigDecimal("ULTLANC");
   }

   public void setUltLanc(BigDecimal ultLanc) {
        markAsChanged("ULTLANC", ultLanc);
   }

   public BigDecimal getVlrDebito() {
        return this.getVo().asBigDecimal("VLRDEBITO");
   }

   public void setVlrDebito(BigDecimal vlrDebito) {
        markAsChanged("VLRDEBITO", vlrDebito);
   }

   public BigDecimal getQtdLanc() {
        return this.getVo().asBigDecimal("QTDLANC");
   }

   public void setQtdLanc(BigDecimal qtdLanc) {
        markAsChanged("QTDLANC", qtdLanc);
   }

   public BigDecimal getVlrDiferenca() {
        return this.getVo().asBigDecimal("VLRDIFERENCA");
   }

   public void setVlrDiferenca(BigDecimal vlrDiferenca) {
        markAsChanged("VLRDIFERENCA", vlrDiferenca);
   }

   public BigDecimal getVlrCredito() {
        return this.getVo().asBigDecimal("VLRCREDITO");
   }

   public void setVlrCredito(BigDecimal vlrCredito) {
        markAsChanged("VLRCREDITO", vlrCredito);
   }

   public BigDecimal getCodEmpConsolid() {
        return this.getVo().asBigDecimal("CODEMPCONSOLID");
   }

   public void setCodEmpConsolid(BigDecimal codEmpConsolid) {
        markAsChanged("CODEMPCONSOLID", codEmpConsolid);
   }

   @Override
   public String getTableName() {
        return "TCBLOT";
   }

   @Override
   public String getEntityName() {
        return "MestreLote";
   }

   @Override
   public MestreLote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
