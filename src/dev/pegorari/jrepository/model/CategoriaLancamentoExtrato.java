package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CategoriaLancamentoExtrato implements SankhyaEntity<CategoriaLancamentoExtrato> {

   private BigDecimal codCtabCoint;
   private BigDecimal codigoEdi;
   private String descricao;
   private BigDecimal sequencia;
   private BigDecimal tipoLanc;

   public BigDecimal getCodCtabCoint() {
        return codCtabCoint;
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        this.codCtabCoint = codCtabCoint;
   }

   public BigDecimal getCodigoEdi() {
        return codigoEdi;
   }

   public void setCodigoEdi(BigDecimal codigoEdi) {
        this.codigoEdi = codigoEdi;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTipoLanc() {
        return tipoLanc;
   }

   public void setTipoLanc(BigDecimal tipoLanc) {
        this.tipoLanc = tipoLanc;
   }

   @Override
   public String getEntityName() {
        return "CategoriaLancamentoExtrato";
   }

   @Override
   public CategoriaLancamentoExtrato fromVO(DynamicVO vo) {
        this.codCtabCoint = vo.asBigDecimal("CODCTABCOINT");
        this.codigoEdi = vo.asBigDecimal("CODIGOEDI");
        this.descricao = vo.asString("DESCRICAO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoLanc = vo.asBigDecimal("TIPOLANC");
        return this;
   }
}
