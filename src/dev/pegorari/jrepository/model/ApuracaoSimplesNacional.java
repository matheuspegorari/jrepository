package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApuracaoSimplesNacional extends AbstractSankhyaEntity<ApuracaoSimplesNacional> {
   private BigDecimal aliqEfetivaMercExt;
   private BigDecimal aliqEfetivaMercInt;
   private BigDecimal faixaMercExt;
   private BigDecimal faixaMercInt;
   private BigDecimal nuApuracao;
   private BigDecimal tipoAnexo;
   private BigDecimal vlrTotRecMen;
   private BigDecimal vlrTotRecMenExt;
   private BigDecimal vlrTotRecMenInt;
   private BigDecimal vlrTotRecProj;
   private BigDecimal vlrTotRecProjExt;
   private BigDecimal vlrTotRecProjInt;

   public BigDecimal getAliqEfetivaMercExt() {
        return aliqEfetivaMercExt;
   }

   public void setAliqEfetivaMercExt(BigDecimal aliqEfetivaMercExt) {
        markAsChanged("ALIQEFETIVAMERCEXT", aliqEfetivaMercExt);
        this.aliqEfetivaMercExt = aliqEfetivaMercExt;
   }

   public BigDecimal getAliqEfetivaMercInt() {
        return aliqEfetivaMercInt;
   }

   public void setAliqEfetivaMercInt(BigDecimal aliqEfetivaMercInt) {
        markAsChanged("ALIQEFETIVAMERCINT", aliqEfetivaMercInt);
        this.aliqEfetivaMercInt = aliqEfetivaMercInt;
   }

   public BigDecimal getFaixaMercExt() {
        return faixaMercExt;
   }

   public void setFaixaMercExt(BigDecimal faixaMercExt) {
        markAsChanged("FAIXAMERCEXT", faixaMercExt);
        this.faixaMercExt = faixaMercExt;
   }

   public BigDecimal getFaixaMercInt() {
        return faixaMercInt;
   }

   public void setFaixaMercInt(BigDecimal faixaMercInt) {
        markAsChanged("FAIXAMERCINT", faixaMercInt);
        this.faixaMercInt = faixaMercInt;
   }

   public BigDecimal getNuApuracao() {
        return nuApuracao;
   }

   public void setNuApuracao(BigDecimal nuApuracao) {
        markAsChanged("NUAPURACAO", nuApuracao);
        this.nuApuracao = nuApuracao;
   }

   public BigDecimal getTipoAnexo() {
        return tipoAnexo;
   }

   public void setTipoAnexo(BigDecimal tipoAnexo) {
        markAsChanged("TIPOANEXO", tipoAnexo);
        this.tipoAnexo = tipoAnexo;
   }

   public BigDecimal getVlrTotRecMen() {
        return vlrTotRecMen;
   }

   public void setVlrTotRecMen(BigDecimal vlrTotRecMen) {
        markAsChanged("VLRTOTRECMEN", vlrTotRecMen);
        this.vlrTotRecMen = vlrTotRecMen;
   }

   public BigDecimal getVlrTotRecMenExt() {
        return vlrTotRecMenExt;
   }

   public void setVlrTotRecMenExt(BigDecimal vlrTotRecMenExt) {
        markAsChanged("VLRTOTRECMENEXT", vlrTotRecMenExt);
        this.vlrTotRecMenExt = vlrTotRecMenExt;
   }

   public BigDecimal getVlrTotRecMenInt() {
        return vlrTotRecMenInt;
   }

   public void setVlrTotRecMenInt(BigDecimal vlrTotRecMenInt) {
        markAsChanged("VLRTOTRECMENINT", vlrTotRecMenInt);
        this.vlrTotRecMenInt = vlrTotRecMenInt;
   }

   public BigDecimal getVlrTotRecProj() {
        return vlrTotRecProj;
   }

   public void setVlrTotRecProj(BigDecimal vlrTotRecProj) {
        markAsChanged("VLRTOTRECPROJ", vlrTotRecProj);
        this.vlrTotRecProj = vlrTotRecProj;
   }

   public BigDecimal getVlrTotRecProjExt() {
        return vlrTotRecProjExt;
   }

   public void setVlrTotRecProjExt(BigDecimal vlrTotRecProjExt) {
        markAsChanged("VLRTOTRECPROJEXT", vlrTotRecProjExt);
        this.vlrTotRecProjExt = vlrTotRecProjExt;
   }

   public BigDecimal getVlrTotRecProjInt() {
        return vlrTotRecProjInt;
   }

   public void setVlrTotRecProjInt(BigDecimal vlrTotRecProjInt) {
        markAsChanged("VLRTOTRECPROJINT", vlrTotRecProjInt);
        this.vlrTotRecProjInt = vlrTotRecProjInt;
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
        this.aliqEfetivaMercExt = vo.asBigDecimal("ALIQEFETIVAMERCEXT");
        this.aliqEfetivaMercInt = vo.asBigDecimal("ALIQEFETIVAMERCINT");
        this.faixaMercExt = vo.asBigDecimal("FAIXAMERCEXT");
        this.faixaMercInt = vo.asBigDecimal("FAIXAMERCINT");
        this.nuApuracao = vo.asBigDecimal("NUAPURACAO");
        this.tipoAnexo = vo.asBigDecimal("TIPOANEXO");
        this.vlrTotRecMen = vo.asBigDecimal("VLRTOTRECMEN");
        this.vlrTotRecMenExt = vo.asBigDecimal("VLRTOTRECMENEXT");
        this.vlrTotRecMenInt = vo.asBigDecimal("VLRTOTRECMENINT");
        this.vlrTotRecProj = vo.asBigDecimal("VLRTOTRECPROJ");
        this.vlrTotRecProjExt = vo.asBigDecimal("VLRTOTRECPROJEXT");
        this.vlrTotRecProjInt = vo.asBigDecimal("VLRTOTRECPROJINT");
        return this;
   }
}
