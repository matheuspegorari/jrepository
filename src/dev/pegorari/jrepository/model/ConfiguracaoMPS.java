package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConfiguracaoMPS extends AbstractSankhyaEntity<ConfiguracaoMPS> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getCodCmps() {
        return this.getVo().asBigDecimal("CODCMPS");
   }

   public void setCodCmps(BigDecimal codCmps) {
        markAsChanged("CODCMPS", codCmps);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   @Override
   public String getTableName() {
        return "TPRCMPS";
   }

   @Override
   public String getEntityName() {
        return "ConfiguracaoMPS";
   }

   @Override
   public ConfiguracaoMPS fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
