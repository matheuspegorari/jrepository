package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LancamentoDeOP extends AbstractSankhyaEntity<LancamentoDeOP> {
   private BigDecimal nuLop;
   private Timestamp dhInc;
   private BigDecimal codUsu;
   private String descricao;
   private String reutilizar;
   private BigDecimal numPs;

   public BigDecimal getNuLop() {
        return nuLop;
   }

   public void setNuLop(BigDecimal nuLop) {
        this.nuLop = nuLop;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getReutilizar() {
        return reutilizar;
   }

   public void setReutilizar(String reutilizar) {
        this.reutilizar = reutilizar;
   }

   public BigDecimal getNumPs() {
        return numPs;
   }

   public void setNumPs(BigDecimal numPs) {
        this.numPs = numPs;
   }

   @Override
   public String getTableName() {
        return "TPRLOP";
   }

   @Override
   public String getEntityName() {
        return "LancamentoDeOP";
   }

   @Override
   public LancamentoDeOP fromVO(DynamicVO vo) {
        this.nuLop = vo.asBigDecimal("NULOP");
        this.dhInc = vo.asTimestamp("DHINC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.reutilizar = vo.asString("REUTILIZAR");
        this.numPs = vo.asBigDecimal("NUMPS");
        return this;
   }
}
