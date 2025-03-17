package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoRecursosWorkCenter implements SankhyaEntity<ApontamentoRecursosWorkCenter> {

   private BigDecimal codCre;
   private String codVol;
   private BigDecimal codWcp;
   private BigDecimal nuApo;
   private BigDecimal qtdApontada;
   private BigDecimal qtdItensRec;
   private BigDecimal qtdRecApontar;
   private BigDecimal qtdUtilizada;
   private BigDecimal seqApa;

   public BigDecimal getCodCre() {
        return codCre;
   }

   public void setCodCre(BigDecimal codCre) {
        this.codCre = codCre;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getQtdApontada() {
        return qtdApontada;
   }

   public void setQtdApontada(BigDecimal qtdApontada) {
        this.qtdApontada = qtdApontada;
   }

   public BigDecimal getQtdItensRec() {
        return qtdItensRec;
   }

   public void setQtdItensRec(BigDecimal qtdItensRec) {
        this.qtdItensRec = qtdItensRec;
   }

   public BigDecimal getQtdRecApontar() {
        return qtdRecApontar;
   }

   public void setQtdRecApontar(BigDecimal qtdRecApontar) {
        this.qtdRecApontar = qtdRecApontar;
   }

   public BigDecimal getQtdUtilizada() {
        return qtdUtilizada;
   }

   public void setQtdUtilizada(BigDecimal qtdUtilizada) {
        this.qtdUtilizada = qtdUtilizada;
   }

   public BigDecimal getSeqApa() {
        return seqApa;
   }

   public void setSeqApa(BigDecimal seqApa) {
        this.seqApa = seqApa;
   }

   @Override
   public String getEntityName() {
        return "ApontamentoRecursosWorkCenter";
   }

   @Override
   public ApontamentoRecursosWorkCenter fromVO(DynamicVO vo) {
        this.codCre = vo.asBigDecimal("CODCRE");
        this.codVol = vo.asString("CODVOL");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.qtdApontada = vo.asBigDecimal("QTDAPONTADA");
        this.qtdItensRec = vo.asBigDecimal("QTDITENSREC");
        this.qtdRecApontar = vo.asBigDecimal("QTDRECAPONTAR");
        this.qtdUtilizada = vo.asBigDecimal("QTDUTILIZADA");
        this.seqApa = vo.asBigDecimal("SEQAPA");
        return this;
   }
}
