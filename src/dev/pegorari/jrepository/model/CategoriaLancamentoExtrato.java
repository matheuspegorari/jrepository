package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CategoriaLancamentoExtrato extends AbstractSankhyaEntity<CategoriaLancamentoExtrato> {
   public BigDecimal getCodCtabcoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabcoint(BigDecimal codCtabcoint) {
        markAsChanged("CODCTABCOINT", codCtabcoint);
   }

   public BigDecimal getCodigoEdi() {
        return this.getVo().asBigDecimal("CODIGOEDI");
   }

   public void setCodigoEdi(BigDecimal codigoEdi) {
        markAsChanged("CODIGOEDI", codigoEdi);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipoLanc() {
        return this.getVo().asBigDecimal("TIPOLANC");
   }

   public void setTipoLanc(BigDecimal tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
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
        this.setVo(vo);
        return this;
   }
}
