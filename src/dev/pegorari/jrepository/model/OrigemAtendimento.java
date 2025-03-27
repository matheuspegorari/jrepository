package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrigemAtendimento extends AbstractSankhyaEntity<OrigemAtendimento> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodOat() {
        return this.getVo().asBigDecimal("CODOAT");
   }

   public void setCodOat(BigDecimal codOat) {
        markAsChanged("CODOAT", codOat);
   }

   public BigDecimal getCodOatPai() {
        return this.getVo().asBigDecimal("CODOATPAI");
   }

   public void setCodOatPai(BigDecimal codOatPai) {
        markAsChanged("CODOATPAI", codOatPai);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescOat() {
        return this.getVo().asString("DESCROAT");
   }

   public void setDescOat(String descOat) {
        markAsChanged("DESCROAT", descOat);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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
        this.setVo(vo);
        return this;
   }
}
