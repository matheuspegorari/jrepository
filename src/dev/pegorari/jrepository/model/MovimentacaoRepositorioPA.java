package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoRepositorioPA extends AbstractSankhyaEntity<MovimentacaoRepositorioPA> {
   public BigDecimal getCodCpm() {
        return this.getVo().asBigDecimal("CODCPM");
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public Timestamp getDhMov() {
        return this.getVo().asTimestamp("DHMOV");
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
   }

   public BigDecimal getIdIatv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
   }

   public BigDecimal getIdProc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdProc(BigDecimal idProc) {
        markAsChanged("IDIPROC", idProc);
   }

   public BigDecimal getIdMer() {
        return this.getVo().asBigDecimal("IDMER");
   }

   public void setIdMer(BigDecimal idMer) {
        markAsChanged("IDMER", idMer);
   }

   public BigDecimal getIdRpa() {
        return this.getVo().asBigDecimal("IDRPA");
   }

   public void setIdRpa(BigDecimal idRpa) {
        markAsChanged("IDRPA", idRpa);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getSeqMer() {
        return this.getVo().asBigDecimal("SEQMER");
   }

   public void setSeqMer(BigDecimal seqMer) {
        markAsChanged("SEQMER", seqMer);
   }

   public BigDecimal getSinal() {
        return this.getVo().asBigDecimal("SINAL");
   }

   public void setSinal(BigDecimal sinal) {
        markAsChanged("SINAL", sinal);
   }

   public String getStatusExec() {
        return this.getVo().asString("STATUSEXEC");
   }

   public void setStatusExec(String statusExec) {
        markAsChanged("STATUSEXEC", statusExec);
   }

   public BigDecimal getQtdPerda() {
        return this.getVo().asBigDecimal("QTDPERDA");
   }

   public void setQtdPerda(BigDecimal qtdPerda) {
        markAsChanged("QTDPERDA", qtdPerda);
   }

   @Override
   public String getTableName() {
        return "TPRMER";
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoRepositorioPA";
   }

   @Override
   public MovimentacaoRepositorioPA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
