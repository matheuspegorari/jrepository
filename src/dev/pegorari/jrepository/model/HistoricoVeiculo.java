package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoVeiculo extends AbstractSankhyaEntity<HistoricoVeiculo> {
   private String ativo;
   private BigDecimal codParctransp;
   private BigDecimal codUsu;
   private BigDecimal codVeiculo;
   private Timestamp dtAlter;
   private Timestamp dtVigor;
   private BigDecimal nuTabFret;
   private BigDecimal preco;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodParctransp() {
        return codParctransp;
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
        this.codParctransp = codParctransp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtVigor() {
        return dtVigor;
   }

   public void setDtVigor(Timestamp dtVigor) {
        markAsChanged("DTVIGOR", dtVigor);
        this.dtVigor = dtVigor;
   }

   public BigDecimal getNuTabFret() {
        return nuTabFret;
   }

   public void setNuTabFret(BigDecimal nuTabFret) {
        markAsChanged("NUTABFRET", nuTabFret);
        this.nuTabFret = nuTabFret;
   }

   public BigDecimal getPreco() {
        return preco;
   }

   public void setPreco(BigDecimal preco) {
        markAsChanged("PRECO", preco);
        this.preco = preco;
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
        this.ativo = vo.asString("ATIVO");
        this.codParctransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtVigor = vo.asTimestamp("DTVIGOR");
        this.nuTabFret = vo.asBigDecimal("NUTABFRET");
        this.preco = vo.asBigDecimal("PRECO");
        return this;
   }
}
