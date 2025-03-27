package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoContaReferencial extends AbstractSankhyaEntity<PlanoContaReferencial> {
   public String getDescrCtaRef() {
        return this.getVo().asString("DESCRCTAREF");
   }

   public void setDescrCtaRef(String descrCtaRef) {
        markAsChanged("DESCRCTAREF", descrCtaRef);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getCodCtaRef() {
        return this.getVo().asString("CODCTAREF");
   }

   public void setCodCtaRef(String codCtaRef) {
        markAsChanged("CODCTAREF", codCtaRef);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getAnalitica() {
        return this.getVo().asString("ANALITICA");
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
   }

   public String getCtcCtbPai() {
        return this.getVo().asString("CTCCTBPAI");
   }

   public void setCtcCtbPai(String ctcCtbPai) {
        markAsChanged("CTCCTBPAI", ctcCtbPai);
   }

   public String getNatureza() {
        return this.getVo().asString("NATUREZA");
   }

   public void setNatureza(String natureza) {
        markAsChanged("NATUREZA", natureza);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   @Override
   public String getTableName() {
        return "TCBPLR";
   }

   @Override
   public String getEntityName() {
        return "PlanoContaReferencial";
   }

   @Override
   public PlanoContaReferencial fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
