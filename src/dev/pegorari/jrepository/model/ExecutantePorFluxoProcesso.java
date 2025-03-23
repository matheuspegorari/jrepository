package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExecutantePorFluxoProcesso extends AbstractSankhyaEntity<ExecutantePorFluxoProcesso> {
   private BigDecimal codProd;
   private BigDecimal codServ;
   private BigDecimal codUsu;
   private BigDecimal sequencia;
   private BigDecimal variacao;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
        this.codServ = codServ;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getVariacao() {
        return variacao;
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
        this.variacao = variacao;
   }

   @Override
   public String getTableName() {
        return "TCSEFL";
   }

   @Override
   public String getEntityName() {
        return "ExecutantePorFluxoProcesso";
   }

   @Override
   public ExecutantePorFluxoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.variacao = vo.asBigDecimal("VARIACAO");
        return this;
   }
}
