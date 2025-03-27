package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PoolImpressoras extends AbstractSankhyaEntity<PoolImpressoras> {
   public String getCaminhoSps() {
        return this.getVo().asString("CAMINHOSPS");
   }

   public void setCaminhoSps(String caminhoSps) {
        markAsChanged("CAMINHOSPS", caminhoSps);
   }

   public String getNomeImpLocal() {
        return this.getVo().asString("NOMEIMPLOCAL");
   }

   public void setNomeImpLocal(String nomeImpLocal) {
        markAsChanged("NOMEIMPLOCAL", nomeImpLocal);
   }

   public BigDecimal getNuNip() {
        return this.getVo().asBigDecimal("NUNIP");
   }

   public void setNuNip(BigDecimal nuNip) {
        markAsChanged("NUNIP", nuNip);
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
        this.setVo(vo);
        return this;
   }
}
