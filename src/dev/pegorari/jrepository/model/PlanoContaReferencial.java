package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoContaReferencial extends AbstractSankhyaEntity<PlanoContaReferencial> {
   private String descrCtaRef;
   private BigDecimal grau;
   private BigDecimal tipo;
   private String codCtaRef;
   private Timestamp dtAlter;
   private BigDecimal codUsu;
   private String analitica;
   private String ctcCtbPai;
   private String natureza;
   private String tabela;

   public String getDescrCtaRef() {
        return descrCtaRef;
   }

   public void setDescrCtaRef(String descrCtaRef) {
        markAsChanged("DESCRCTAREF", descrCtaRef);
        this.descrCtaRef = descrCtaRef;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getCodCtaRef() {
        return codCtaRef;
   }

   public void setCodCtaRef(String codCtaRef) {
        markAsChanged("CODCTAREF", codCtaRef);
        this.codCtaRef = codCtaRef;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getAnalitica() {
        return analitica;
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
        this.analitica = analitica;
   }

   public String getCtcCtbPai() {
        return ctcCtbPai;
   }

   public void setCtcCtbPai(String ctcCtbPai) {
        markAsChanged("CTCCTBPAI", ctcCtbPai);
        this.ctcCtbPai = ctcCtbPai;
   }

   public String getNatureza() {
        return natureza;
   }

   public void setNatureza(String natureza) {
        markAsChanged("NATUREZA", natureza);
        this.natureza = natureza;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
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
        this.setOriginalVO(vo);
        this.descrCtaRef = vo.asString("DESCRCTAREF");
        this.grau = vo.asBigDecimal("GRAU");
        this.tipo = vo.asBigDecimal("TIPO");
        this.codCtaRef = vo.asString("CODCTAREF");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.analitica = vo.asString("ANALITICA");
        this.ctcCtbPai = vo.asString("CTCCTBPAI");
        this.natureza = vo.asString("NATUREZA");
        this.tabela = vo.asString("TABELA");
        return this;
   }
}
