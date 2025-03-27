package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApuracaoSimplesNacional extends AbstractSankhyaEntity<ApuracaoSimplesNacional> {
   public BigDecimal getAliqEfetivaMercExt() {
        return this.getVo().asBigDecimal("ALIQEFETIVAMERCEXT");
   }

   public void setAliqEfetivaMercExt(BigDecimal aliqEfetivaMercExt) {
        markAsChanged("ALIQEFETIVAMERCEXT", aliqEfetivaMercExt);
   }

   public BigDecimal getAliqEfetivaMercInt() {
        return this.getVo().asBigDecimal("ALIQEFETIVAMERCINT");
   }

   public void setAliqEfetivaMercInt(BigDecimal aliqEfetivaMercInt) {
        markAsChanged("ALIQEFETIVAMERCINT", aliqEfetivaMercInt);
   }

   public BigDecimal getFaixaMercExt() {
        return this.getVo().asBigDecimal("FAIXAMERCEXT");
   }

   public void setFaixaMercExt(BigDecimal faixaMercExt) {
        markAsChanged("FAIXAMERCEXT", faixaMercExt);
   }

   public BigDecimal getFaixaMercInt() {
        return this.getVo().asBigDecimal("FAIXAMERCINT");
   }

   public void setFaixaMercInt(BigDecimal faixaMercInt) {
        markAsChanged("FAIXAMERCINT", faixaMercInt);
   }

   public BigDecimal getNuApuracao() {
        return this.getVo().asBigDecimal("NUAPURACAO");
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
   }

   public BigDecimal getTipoAnexo() {
        return this.getVo().asBigDecimal("TIPOANEXO");
   }

   public void setTipoAnexo(BigDecimal tipoAnexo) {
        markAsChanged("TIPOANEXO", tipoAnexo);
   }

   public BigDecimal getVlrTotRecMen() {
        return this.getVo().asBigDecimal("VLRTOTRECMEN");
   }

   public void setVlrTotRecMen(BigDecimal vlrTotRecMen) {
        markAsChanged("VLRTOTRECMEN", vlrTotRecMen);
   }

   public BigDecimal getVlrTotRecMenExt() {
        return this.getVo().asBigDecimal("VLRTOTRECMENEXT");
   }

   public void setVlrTotRecMenExt(BigDecimal vlrTotRecMenExt) {
        markAsChanged("VLRTOTRECMENEXT", vlrTotRecMenExt);
   }

   public BigDecimal getVlrTotRecMenInt() {
        return this.getVo().asBigDecimal("VLRTOTRECMENINT");
   }

   public void setVlrTotRecMenInt(BigDecimal vlrTotRecMenInt) {
        markAsChanged("VLRTOTRECMENINT", vlrTotRecMenInt);
   }

   public BigDecimal getVlrTotRecProj() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJ");
   }

   public void setVlrTotRecProj(BigDecimal vlrTotRecProj) {
        markAsChanged("VLRTOTRECPROJ", vlrTotRecProj);
   }

   public BigDecimal getVlrTotRecProjExt() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJEXT");
   }

   public void setVlrTotRecProjExt(BigDecimal vlrTotRecProjExt) {
        markAsChanged("VLRTOTRECPROJEXT", vlrTotRecProjExt);
   }

   public BigDecimal getVlrTotRecProjInt() {
        return this.getVo().asBigDecimal("VLRTOTRECPROJINT");
   }

   public void setVlrTotRecProjInt(BigDecimal vlrTotRecProjInt) {
        markAsChanged("VLRTOTRECPROJINT", vlrTotRecProjInt);
   }

   @Override
   public String getTableName() {
        return "TGFAPSN";
   }

   @Override
   public String getEntityName() {
        return "ApuracaoSimplesNacional";
   }

   @Override
   public ApuracaoSimplesNacional fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
