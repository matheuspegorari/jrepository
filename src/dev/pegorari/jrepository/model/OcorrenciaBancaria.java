package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaBancaria extends AbstractSankhyaEntity<OcorrenciaBancaria> {
   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodOcor() {
        return this.getVo().asBigDecimal("CODOCOR");
   }

   public void setCodOcor(BigDecimal codOcor) {
        markAsChanged("CODOCOR", codOcor);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   @Override
   public String getTableName() {
        return "TGFOBC";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaBancaria";
   }

   @Override
   public OcorrenciaBancaria fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
