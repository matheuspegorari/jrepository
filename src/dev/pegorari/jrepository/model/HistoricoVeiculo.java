package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoVeiculo extends AbstractSankhyaEntity<HistoricoVeiculo> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodParctransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtVigor() {
        return this.getVo().asTimestamp("DTVIGOR");
   }

   public void setDtVigor(Timestamp dtVigor) {
        markAsChanged("DTVIGOR", dtVigor);
   }

   public BigDecimal getNuTabFret() {
        return this.getVo().asBigDecimal("NUTABFRET");
   }

   public void setNuTabFret(BigDecimal nuTabFret) {
        markAsChanged("NUTABFRET", nuTabFret);
   }

   public BigDecimal getPreco() {
        return this.getVo().asBigDecimal("PRECO");
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
   }

   @Override
   public String getTableName() {
        return "TGFTFR";
   }

   @Override
   public String getEntityName() {
        return "HistoricoVeiculo";
   }

   @Override
   public HistoricoVeiculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
