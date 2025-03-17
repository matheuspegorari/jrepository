package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AvaliacaoDesempenho extends AbstractSankhyaEntity<AvaliacaoDesempenho> {
   private BigDecimal nuPla;
   private BigDecimal nuAvaliacao;
   private BigDecimal nuPlaAvaliado;
   private Timestamp dhAlter;
   private BigDecimal codUsu;

   public BigDecimal getNuPla() {
        return nuPla;
   }

   public void setNuPla(BigDecimal nuPla) {
        this.nuPla = nuPla;
   }

   public BigDecimal getNuAvaliacao() {
        return nuAvaliacao;
   }

   public void setNuAvaliacao(BigDecimal nuAvaliacao) {
        this.nuAvaliacao = nuAvaliacao;
   }

   public BigDecimal getNuPlaAvaliado() {
        return nuPlaAvaliado;
   }

   public void setNuPlaAvaliado(BigDecimal nuPlaAvaliado) {
        this.nuPlaAvaliado = nuPlaAvaliado;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getTableName() {
        return "TPQAVD";
   }

   @Override
   public String getEntityName() {
        return "AvaliacaoDesempenho";
   }

   @Override
   public AvaliacaoDesempenho fromVO(DynamicVO vo) {
        this.nuPla = vo.asBigDecimal("NUPLA");
        this.nuAvaliacao = vo.asBigDecimal("NUAVALIACAO");
        this.nuPlaAvaliado = vo.asBigDecimal("NUPLAAVALIADO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
