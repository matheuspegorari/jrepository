package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaBancaria extends AbstractSankhyaEntity<OcorrenciaBancaria> {
   private BigDecimal codBco;
   private BigDecimal codOcor;
   private String descricao;

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public BigDecimal getCodOcor() {
        return codOcor;
   }

   public void setCodOcor(BigDecimal codOcor) {
        markAsChanged("CODOCOR", codOcor);
        this.codOcor = codOcor;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
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
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codOcor = vo.asBigDecimal("CODOCOR");
        this.descricao = vo.asString("DESCRICAO");
        return this;
   }
}
