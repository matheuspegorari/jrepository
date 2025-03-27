package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BlocosEscrituracaoFiscal extends AbstractSankhyaEntity<BlocosEscrituracaoFiscal> {
   public String getBloco() {
        return this.getVo().asString("BLOCO");
   }

   public void setBloco(String bloco) {
        markAsChanged("BLOCO", bloco);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getGerarBloco() {
        return this.getVo().asString("GERARBLOCO");
   }

   public void setGerarBloco(String gerarBloco) {
        markAsChanged("GERARBLOCO", gerarBloco);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFEFB";
   }

   @Override
   public String getEntityName() {
        return "BlocosEscrituracaoFiscal";
   }

   @Override
   public BlocosEscrituracaoFiscal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
