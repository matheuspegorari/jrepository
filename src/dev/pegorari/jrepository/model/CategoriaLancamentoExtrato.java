package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CategoriaLancamentoExtrato extends AbstractSankhyaEntity<CategoriaLancamentoExtrato> {
   private BigDecimal codCtabcoint;
   private BigDecimal codigoEdi;
   private String descricao;
   private BigDecimal sequencia;
   private BigDecimal tipoLanc;

   public BigDecimal getCodCtabcoint() {
        return codCtabcoint;
   }

   public void setCodCtabcoint(BigDecimal codCtabcoint) {
        markAsChanged("CODCTABCOINT", codCtabcoint);
        this.codCtabcoint = codCtabcoint;
   }

   public BigDecimal getCodigoEdi() {
        return codigoEdi;
   }

   public void setCodigoEdi(BigDecimal codigoEdi) {
        markAsChanged("CODIGOEDI", codigoEdi);
        this.codigoEdi = codigoEdi;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTipoLanc() {
        return tipoLanc;
   }

   public void setTipoLanc(BigDecimal tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
        this.tipoLanc = tipoLanc;
   }

   @Override
   public String getTableName() {
        return "TGFCLE";
   }

   @Override
   public String getEntityName() {
        return "CategoriaLancamentoExtrato";
   }

   @Override
   public CategoriaLancamentoExtrato fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codCtabcoint = vo.asBigDecimal("CODCTABCOINT");
        this.codigoEdi = vo.asBigDecimal("CODIGOEDI");
        this.descricao = vo.asString("DESCRICAO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoLanc = vo.asBigDecimal("TIPOLANC");
        return this;
   }
}
