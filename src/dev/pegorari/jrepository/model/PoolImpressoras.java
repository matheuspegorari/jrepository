package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PoolImpressoras extends AbstractSankhyaEntity<PoolImpressoras> {
   private String caminhoSps;
   private String nomeImpLocal;
   private BigDecimal nuNip;

   public String getCaminhoSps() {
        return caminhoSps;
   }

   public void setCaminhoSps(String caminhoSps) {
        this.caminhoSps = caminhoSps;
   }

   public String getNomeImpLocal() {
        return nomeImpLocal;
   }

   public void setNomeImpLocal(String nomeImpLocal) {
        this.nomeImpLocal = nomeImpLocal;
   }

   public BigDecimal getNuNip() {
        return nuNip;
   }

   public void setNuNip(BigDecimal nuNip) {
        this.nuNip = nuNip;
   }

   @Override
   public String getTableName() {
        return "TSIPRP";
   }

   @Override
   public String getEntityName() {
        return "PoolImpressoras";
   }

   @Override
   public PoolImpressoras fromVO(DynamicVO vo) {
        this.caminhoSps = vo.asString("CAMINHOSPS");
        this.nomeImpLocal = vo.asString("NOMEIMPLOCAL");
        this.nuNip = vo.asBigDecimal("NUNIP");
        return this;
   }
}
