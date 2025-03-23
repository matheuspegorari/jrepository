package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BlocosEscrituracaoFiscal extends AbstractSankhyaEntity<BlocosEscrituracaoFiscal> {
   private String bloco;
   private BigDecimal codEmp;
   private String descricao;
   private String gerarBloco;
   private BigDecimal sequencia;
   private BigDecimal tipo;

   public String getBloco() {
        return bloco;
   }

   public void setBloco(String bloco) {
        markAsChanged("BLOCO", bloco);
        this.bloco = bloco;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getGerarBloco() {
        return gerarBloco;
   }

   public void setGerarBloco(String gerarBloco) {
        markAsChanged("GERARBLOCO", gerarBloco);
        this.gerarBloco = gerarBloco;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.bloco = vo.asString("BLOCO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.descricao = vo.asString("DESCRICAO");
        this.gerarBloco = vo.asString("GERARBLOCO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asBigDecimal("TIPO");
        return this;
   }
}
