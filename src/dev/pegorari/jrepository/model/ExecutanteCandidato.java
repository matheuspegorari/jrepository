package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ExecutanteCandidato extends AbstractSankhyaEntity<ExecutanteCandidato> {
   private BigDecimal codigo;
   private String formula;
   private BigDecimal ideFx;
   private BigDecimal seqEcd;
   private String tipo;
   private String nome;

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getSeqEcd() {
        return seqEcd;
   }

   public void setSeqEcd(BigDecimal seqEcd) {
        markAsChanged("SEQECD", seqEcd);
        this.seqEcd = seqEcd;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   @Override
   public String getTableName() {
        return "TPRECD";
   }

   @Override
   public String getEntityName() {
        return "ExecutanteCandidato";
   }

   @Override
   public ExecutanteCandidato fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codigo = vo.asBigDecimal("CODIGO");
        this.formula = vo.asString("FORMULA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.seqEcd = vo.asBigDecimal("SEQECD");
        this.tipo = vo.asString("TIPO");
        this.nome = vo.asString("NOME");
        return this;
   }
}
