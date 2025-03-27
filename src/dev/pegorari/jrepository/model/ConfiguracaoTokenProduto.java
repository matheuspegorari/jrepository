package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoTokenProduto extends AbstractSankhyaEntity<ConfiguracaoTokenProduto> {
   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCfg() {
        return this.getVo().asBigDecimal("CODCFG");
   }

   public void setCodCfg(BigDecimal codCfg) {
        markAsChanged("CODCFG", codCfg);
   }

   public Timestamp getDhUltExec() {
        return this.getVo().asTimestamp("DHULTEXEC");
   }

   public void setDhUltExec(Timestamp dhUltExec) {
        markAsChanged("DHULTEXEC", dhUltExec);
   }

   @Override
   public String getTableName() {
        return "TGFTOKCFG";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoTokenProduto";
   }

   @Override
   public ConfiguracaoTokenProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
