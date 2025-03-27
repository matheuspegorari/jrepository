package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoRecursosWorkCenter extends AbstractSankhyaEntity<ApontamentoRecursosWorkCenter> {
   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getQtdApontada() {
        return this.getVo().asBigDecimal("QTDAPONTADA");
   }

   public void setQtdApontada(BigDecimal qtdApontada) {
        markAsChanged("QTDAPONTADA", qtdApontada);
   }

   public BigDecimal getQtdItensRec() {
        return this.getVo().asBigDecimal("QTDITENSREC");
   }

   public void setQtdItensRec(BigDecimal qtdItensRec) {
        markAsChanged("QTDITENSREC", qtdItensRec);
   }

   public BigDecimal getQtdRecApontar() {
        return this.getVo().asBigDecimal("QTDRECAPONTAR");
   }

   public void setQtdRecApontar(BigDecimal qtdRecApontar) {
        markAsChanged("QTDRECAPONTAR", qtdRecApontar);
   }

   public BigDecimal getQtdUtilizada() {
        return this.getVo().asBigDecimal("QTDUTILIZADA");
   }

   public void setQtdUtilizada(BigDecimal qtdUtilizada) {
        markAsChanged("QTDUTILIZADA", qtdUtilizada);
   }

   public BigDecimal getSeqApa() {
        return this.getVo().asBigDecimal("SEQAPA");
   }

   public void setSeqApa(BigDecimal seqApa) {
        markAsChanged("SEQAPA", seqApa);
   }

   @Override
   public String getTableName() {
        return "TPRARW";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoRecursosWorkCenter";
   }

   @Override
   public ApontamentoRecursosWorkCenter fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
