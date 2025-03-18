package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrigemAtendimento extends AbstractSankhyaEntity<OrigemAtendimento> {
   private String analitico;
   private String ativo;
   private BigDecimal codOat;
   private BigDecimal codOatPai;
   private BigDecimal codUsu;
   private String descOat;
   private Timestamp dtAlter;
   private BigDecimal grau;
   private String tipo;

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodOat() {
        return codOat;
   }

   public void setCodOat(BigDecimal codOat) {
        markAsChanged("CODOAT", codOat);
        this.codOat = codOat;
   }

   public BigDecimal getCodOatPai() {
        return codOatPai;
   }

   public void setCodOatPai(BigDecimal codOatPai) {
        markAsChanged("CODOATPAI", codOatPai);
        this.codOatPai = codOatPai;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescOat() {
        return descOat;
   }

   public void setDescOat(String descOat) {
        markAsChanged("DESCROAT", descOat);
        this.descOat = descOat;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TCSOAT";
   }

   @Override
   public String getEntityName() {
        return "OrigemAtendimento";
   }

   @Override
   public OrigemAtendimento fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codOat = vo.asBigDecimal("CODOAT");
        this.codOatPai = vo.asBigDecimal("CODOATPAI");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descOat = vo.asString("DESCROAT");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.grau = vo.asBigDecimal("GRAU");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
