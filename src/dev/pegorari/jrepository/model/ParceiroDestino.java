package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroDestino extends AbstractSankhyaEntity<ParceiroDestino> {
   private String identInscEstad;
   private String implAudolote;
   private String indNatRet;
   private String inscEstadNauf;
   private String agencia;
   private String agronomo;
   private String agrupar;
   private BigDecimal aliqIssRetSimples;
   private String aluno;
   private String ativo;
   private String bloquear;
   private String caixaPostal;
   private String calcInss;
   private String cei;
   private String cep;
   private String cgcCpf;
   private String classificMs;
   private String cliente;
   private String codAge;
   private BigDecimal codAnt;
   private BigDecimal codAssessor;
   private BigDecimal codBai;
   private BigDecimal codBco;
   private BigDecimal codCid;
   private BigDecimal codCred;
   private String codCtaBco;
   private BigDecimal codCtaBcoInt;
   private BigDecimal codCtaCtb;
   private BigDecimal codCtaCtb2;
   private BigDecimal codCtaCtb3;
   private BigDecimal codCtaCtb4;
   private BigDecimal codEmp;
   private BigDecimal codEmpPref;
   private BigDecimal codEnd;
   private BigDecimal codLocalPadrao;
   private BigDecimal codParc;
   private BigDecimal codParcMatriz;
   private BigDecimal codReg;
   private BigDecimal codRota;
   private BigDecimal codTab;
   private BigDecimal codTabSt;
   private BigDecimal codTipParc;
   private String codUniMed;
   private BigDecimal codUsu;
   private BigDecimal codUsuCobr;
   private BigDecimal codVend;
   private String complemento;
   private String contAcesso;
   private BigDecimal csTipIEnt;
   private BigDecimal csTipISai;
   private String ctaAdiant;
   private String descBonif;
   private BigDecimal descFin;
   private String descrRota;
   private String descStIva;
   private BigDecimal diaSem;
   private BigDecimal diasVarPagto;
   private Timestamp dtAlter;
   private Timestamp dtCad;
   private Timestamp dtNasc;
   private Timestamp dtUltContato;
   private Timestamp dtUltNegoc;
   private Timestamp dhCadSefaz;
   private String eVenda;
   private String fax;
   private String emailDanfe;
   private String emailNfe;
   private String entregaEndContato;
   private String flex;
   private String fornecedor;
   private String grupoAutor;
   private String homePage;
   private String eCompra;
   private String email;
   private BigDecimal codEnqIpISai;
   private BigDecimal codEnqIpIEnt;
   private String idEstrangeiro;
   private String tipGerBolCent;
   private String comoConheceu;
   private BigDecimal sitCadSefaz;
   private String timProprieta;
   private String timPropVenda;
   private String timQuerComprar;
   private String timReferencia01;
   private String timReferencia02;
   private String timSenhaDesc;
   private String timSenhaSite;
   private String timTelefone01;
   private String timTelefone02;
   private String timTipoMoradia;
   private String truncParcela;
   private String vlrLiqItemNfce;
   private String vlrLiqItemNfe;
   private String enviaDanfeRedespacho;
   private String exigContatoEntCab;
   private String parcSubstIss;
   private String arredPrimeiraParc;
   private String associacaoDesp;
   private String cnae;
   private BigDecimal codContatoPadCot;
   private BigDecimal codGrupo;
   private BigDecimal codParcGruEconomico;
   private String cpfProdRural;
   private Timestamp dhCadRf;
   private Timestamp dtBaixa;
   private Timestamp dtIniAtiv;
   private Timestamp dtUltSit;
   private String emailNfse;
   private String enqArt227;
   private BigDecimal indCredCte;
   private BigDecimal indCredNfe;
   private BigDecimal indOpCcp;
   private BigDecimal modeloNotaCompra;
   private BigDecimal nuFop;
   private String orgPublNfse;
   private String parcInter;
   private String regApur;
   private BigDecimal sitCadRf;
   private BigDecimal timAInvestir;
   private BigDecimal timBairroCompra;
   private BigDecimal timCartorio;
   private String timCartRegimeBensV;
   private String timComprador;
   private String timCorrespBancario;
   private String timCorretor;
   private Timestamp timDataCi;
   private String timEstadoCivil;
   private String timFaixaSalarial;
   private String timFiador;
   private String timInquilino;
   private String timMae;
   private BigDecimal timNacionalidad;
   private String timOrgao;
   private String timOutTels;
   private String timPai;
   private BigDecimal timProfissao;
   private String calcFetHab;
   private String aplicLeiTransp;
   private String emailNotifEntrega;
   private String impAgrupFin;
   private String indAquisicao;
   private String indComercializacao;
   private BigDecimal uniDImport;
   private String inscMun;
   private String ipiInciCms;
   private String latitude;
   private BigDecimal limCred;
   private BigDecimal limCredMensal;
   private String longitude;
   private String medico;
   private String meiRj;
   private String modeloNfDes;
   private String motBloq;
   private String motorista;
   private String naturezaOperDes;
   private String nomeAge;
   private String nomeParc;
   private String numEnd;
   private String observacoes;
   private String operLogist;
   private BigDecimal percCusVar;
   private BigDecimal percDescEspecial;
   private BigDecimal percJuro;
   private BigDecimal percMulta;
   private BigDecimal potencialNeg;
   private BigDecimal prazoContato;
   private BigDecimal prazoPag;
   private String produtorTemNf;
   private String professor;
   private BigDecimal qtdMaxPedCpa;
   private BigDecimal qtdMaxTitVencidos;
   private BigDecimal ramal;
   private String razaoSocial;
   private String retemCofins;
   private String retemCsl;
   private String retemInss;
   private String retemIss;
   private String retemPis;
   private String retStVenda;
   private String selecionado;
   private String serieNfDes;
   private String sexo;
   private String simples;
   private String sitCcf;
   private String sitReceita;
   private String sitSintegra;
   private String situacao;
   private String statusEdz;
   private String tare;
   private String telefone;
   private String temIpi;
   private String tipAnexoNfe;
   private String tipJuro;
   private String tipoFatur;
   private String tipoGerBoleto;
   private String tipoPessoa;
   private BigDecimal tolerInadImp;
   private String transportadora;
   private String usaTabCrForn;
   private String usuario;
   private String valDescGrdCar;
   private String vendedor;
   private BigDecimal vlrMinPedCpa;
   private String termAcord;
   private BigDecimal intervAnalisCred;
   private BigDecimal vendaMin;
   private String transpPropria;
   private String exigeNomeParc;
   private String estabTransp;
   private Timestamp dtEmisNfeForn;
   private BigDecimal percRedInss;
   private BigDecimal diaPagtoEconect;
   private BigDecimal diaFechaEconect;
   private String integraEconect;
   private BigDecimal baseParceleConect;
   private String senhaEconect;
   private String prazoParcEconect;
   private String parcelaMeConect;
   private String perfilEconect;
   private BigDecimal basePrazoEconect;
   private String tiposParc;
   private String enviaPedEmailTop;
   private String motNaoReterIssqn;
   private String sitEspecialResp;
   private BigDecimal provAcresc;
   private BigDecimal saldoDisp;
   private String tipLotacao;
   private String chavePix;
   private String desconsideraDescBase;
   private BigDecimal codIdentCons;
   private BigDecimal tipClienteServCom;
   private String utilizaNucadParc;
   private BigDecimal provAcrescCac;
   private BigDecimal saldoDispCac;
   private String atNuVersao;
   private BigDecimal nuVersao;
   private String considTotItensTrib;
   private String deduzIpiBcPisCf;
   private String consParcAdrCst;
   private String descontaDescInss;
   private String emailCte;
   private String rede;
   private BigDecimal grupoPisCofins;

   public String getIdentInscEstad() {
        return identInscEstad;
   }

   public void setIdentInscEstad(String identInscEstad) {
        markAsChanged("IDENTINSCESTAD", identInscEstad);
        this.identInscEstad = identInscEstad;
   }

   public String getImplAudolote() {
        return implAudolote;
   }

   public void setImplAudolote(String implAudolote) {
        markAsChanged("IMPLAUDOLOTE", implAudolote);
        this.implAudolote = implAudolote;
   }

   public String getIndNatRet() {
        return indNatRet;
   }

   public void setIndNatRet(String indNatRet) {
        markAsChanged("INDNATRET", indNatRet);
        this.indNatRet = indNatRet;
   }

   public String getInscEstadNauf() {
        return inscEstadNauf;
   }

   public void setInscEstadNauf(String inscEstadNauf) {
        markAsChanged("INSCESTADNAUF", inscEstadNauf);
        this.inscEstadNauf = inscEstadNauf;
   }

   public String getAgencia() {
        return agencia;
   }

   public void setAgencia(String agencia) {
        markAsChanged("AGENCIA", agencia);
        this.agencia = agencia;
   }

   public String getAgronomo() {
        return agronomo;
   }

   public void setAgronomo(String agronomo) {
        markAsChanged("AGRONOMO", agronomo);
        this.agronomo = agronomo;
   }

   public String getAgrupar() {
        return agrupar;
   }

   public void setAgrupar(String agrupar) {
        markAsChanged("AGRUPAR", agrupar);
        this.agrupar = agrupar;
   }

   public BigDecimal getAliqIssRetSimples() {
        return aliqIssRetSimples;
   }

   public void setAliqIssRetSimples(BigDecimal aliqIssRetSimples) {
        markAsChanged("ALIQISSRETSIMPLES", aliqIssRetSimples);
        this.aliqIssRetSimples = aliqIssRetSimples;
   }

   public String getAluno() {
        return aluno;
   }

   public void setAluno(String aluno) {
        markAsChanged("ALUNO", aluno);
        this.aluno = aluno;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getBloquear() {
        return bloquear;
   }

   public void setBloquear(String bloquear) {
        markAsChanged("BLOQUEAR", bloquear);
        this.bloquear = bloquear;
   }

   public String getCaixaPostal() {
        return caixaPostal;
   }

   public void setCaixaPostal(String caixaPostal) {
        markAsChanged("CAIXAPOSTAL", caixaPostal);
        this.caixaPostal = caixaPostal;
   }

   public String getCalcInss() {
        return calcInss;
   }

   public void setCalcInss(String calcInss) {
        markAsChanged("CALCINSS", calcInss);
        this.calcInss = calcInss;
   }

   public String getCei() {
        return cei;
   }

   public void setCei(String cei) {
        markAsChanged("CEI", cei);
        this.cei = cei;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
        this.cep = cep;
   }

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   public String getClassificMs() {
        return classificMs;
   }

   public void setClassificMs(String classificMs) {
        markAsChanged("CLASSIFICMS", classificMs);
        this.classificMs = classificMs;
   }

   public String getCliente() {
        return cliente;
   }

   public void setCliente(String cliente) {
        markAsChanged("CLIENTE", cliente);
        this.cliente = cliente;
   }

   public String getCodAge() {
        return codAge;
   }

   public void setCodAge(String codAge) {
        markAsChanged("CODAGE", codAge);
        this.codAge = codAge;
   }

   public BigDecimal getCodAnt() {
        return codAnt;
   }

   public void setCodAnt(BigDecimal codAnt) {
        markAsChanged("CODANT", codAnt);
        this.codAnt = codAnt;
   }

   public BigDecimal getCodAssessor() {
        return codAssessor;
   }

   public void setCodAssessor(BigDecimal codAssessor) {
        markAsChanged("CODASSESSOR", codAssessor);
        this.codAssessor = codAssessor;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
        this.codBai = codBai;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodCred() {
        return codCred;
   }

   public void setCodCred(BigDecimal codCred) {
        markAsChanged("CODCRED", codCred);
        this.codCred = codCred;
   }

   public String getCodCtaBco() {
        return codCtaBco;
   }

   public void setCodCtaBco(String codCtaBco) {
        markAsChanged("CODCTABCO", codCtaBco);
        this.codCtaBco = codCtaBco;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodCtaCtb2() {
        return codCtaCtb2;
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
        this.codCtaCtb2 = codCtaCtb2;
   }

   public BigDecimal getCodCtaCtb3() {
        return codCtaCtb3;
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        markAsChanged("CODCTACTB3", codCtaCtb3);
        this.codCtaCtb3 = codCtaCtb3;
   }

   public BigDecimal getCodCtaCtb4() {
        return codCtaCtb4;
   }

   public void setCodCtaCtb4(BigDecimal codCtaCtb4) {
        markAsChanged("CODCTACTB4", codCtaCtb4);
        this.codCtaCtb4 = codCtaCtb4;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpPref() {
        return codEmpPref;
   }

   public void setCodEmpPref(BigDecimal codEmpPref) {
        markAsChanged("CODEMPPREF", codEmpPref);
        this.codEmpPref = codEmpPref;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodLocalPadrao() {
        return codLocalPadrao;
   }

   public void setCodLocalPadrao(BigDecimal codLocalPadrao) {
        markAsChanged("CODLOCALPADRAO", codLocalPadrao);
        this.codLocalPadrao = codLocalPadrao;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodParcMatriz() {
        return codParcMatriz;
   }

   public void setCodParcMatriz(BigDecimal codParcMatriz) {
        markAsChanged("CODPARCMATRIZ", codParcMatriz);
        this.codParcMatriz = codParcMatriz;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodRota() {
        return codRota;
   }

   public void setCodRota(BigDecimal codRota) {
        markAsChanged("CODROTA", codRota);
        this.codRota = codRota;
   }

   public BigDecimal getCodTab() {
        return codTab;
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
        this.codTab = codTab;
   }

   public BigDecimal getCodTabSt() {
        return codTabSt;
   }

   public void setCodTabSt(BigDecimal codTabSt) {
        markAsChanged("CODTABST", codTabSt);
        this.codTabSt = codTabSt;
   }

   public BigDecimal getCodTipParc() {
        return codTipParc;
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
        this.codTipParc = codTipParc;
   }

   public String getCodUniMed() {
        return codUniMed;
   }

   public void setCodUniMed(String codUniMed) {
        markAsChanged("CODUNIMED", codUniMed);
        this.codUniMed = codUniMed;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuCobr() {
        return codUsuCobr;
   }

   public void setCodUsuCobr(BigDecimal codUsuCobr) {
        markAsChanged("CODUSUCOBR", codUsuCobr);
        this.codUsuCobr = codUsuCobr;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public String getContAcesso() {
        return contAcesso;
   }

   public void setContAcesso(String contAcesso) {
        markAsChanged("CONTACESSO", contAcesso);
        this.contAcesso = contAcesso;
   }

   public BigDecimal getCsTipIEnt() {
        return csTipIEnt;
   }

   public void setCsTipIEnt(BigDecimal csTipIEnt) {
        markAsChanged("CSTIPIENT", csTipIEnt);
        this.csTipIEnt = csTipIEnt;
   }

   public BigDecimal getCsTipISai() {
        return csTipISai;
   }

   public void setCsTipISai(BigDecimal csTipISai) {
        markAsChanged("CSTIPISAI", csTipISai);
        this.csTipISai = csTipISai;
   }

   public String getCtaAdiant() {
        return ctaAdiant;
   }

   public void setCtaAdiant(String ctaAdiant) {
        markAsChanged("CTAADIANT", ctaAdiant);
        this.ctaAdiant = ctaAdiant;
   }

   public String getDescBonif() {
        return descBonif;
   }

   public void setDescBonif(String descBonif) {
        markAsChanged("DESCBONIF", descBonif);
        this.descBonif = descBonif;
   }

   public BigDecimal getDescFin() {
        return descFin;
   }

   public void setDescFin(BigDecimal descFin) {
        markAsChanged("DESCFIN", descFin);
        this.descFin = descFin;
   }

   public String getDescrRota() {
        return descrRota;
   }

   public void setDescrRota(String descrRota) {
        markAsChanged("DESCRROTA", descrRota);
        this.descrRota = descrRota;
   }

   public String getDescStIva() {
        return descStIva;
   }

   public void setDescStIva(String descStIva) {
        markAsChanged("DESCSTIVA", descStIva);
        this.descStIva = descStIva;
   }

   public BigDecimal getDiaSem() {
        return diaSem;
   }

   public void setDiaSem(BigDecimal diaSem) {
        markAsChanged("DIASEM", diaSem);
        this.diaSem = diaSem;
   }

   public BigDecimal getDiasVarPagto() {
        return diasVarPagto;
   }

   public void setDiasVarPagto(BigDecimal diasVarPagto) {
        markAsChanged("DIASVARPAGTO", diasVarPagto);
        this.diasVarPagto = diasVarPagto;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtCad() {
        return dtCad;
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
        this.dtCad = dtCad;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
        this.dtNasc = dtNasc;
   }

   public Timestamp getDtUltContato() {
        return dtUltContato;
   }

   public void setDtUltContato(Timestamp dtUltContato) {
        markAsChanged("DTULTCONTATO", dtUltContato);
        this.dtUltContato = dtUltContato;
   }

   public Timestamp getDtUltNegoc() {
        return dtUltNegoc;
   }

   public void setDtUltNegoc(Timestamp dtUltNegoc) {
        markAsChanged("DTULTNEGOC", dtUltNegoc);
        this.dtUltNegoc = dtUltNegoc;
   }

   public Timestamp getDhCadSefaz() {
        return dhCadSefaz;
   }

   public void setDhCadSefaz(Timestamp dhCadSefaz) {
        markAsChanged("DHCADSEFAZ", dhCadSefaz);
        this.dhCadSefaz = dhCadSefaz;
   }

   public String getEVenda() {
        return eVenda;
   }

   public void setEVenda(String eVenda) {
        markAsChanged("EVENDA", eVenda);
        this.eVenda = eVenda;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
        this.fax = fax;
   }

   public String getEmailDanfe() {
        return emailDanfe;
   }

   public void setEmailDanfe(String emailDanfe) {
        markAsChanged("EMAILDANFE", emailDanfe);
        this.emailDanfe = emailDanfe;
   }

   public String getEmailNfe() {
        return emailNfe;
   }

   public void setEmailNfe(String emailNfe) {
        markAsChanged("EMAILNFE", emailNfe);
        this.emailNfe = emailNfe;
   }

   public String getEntregaEndContato() {
        return entregaEndContato;
   }

   public void setEntregaEndContato(String entregaEndContato) {
        markAsChanged("ENTREGAENDCONTATO", entregaEndContato);
        this.entregaEndContato = entregaEndContato;
   }

   public String getFlex() {
        return flex;
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
        this.flex = flex;
   }

   public String getFornecedor() {
        return fornecedor;
   }

   public void setFornecedor(String fornecedor) {
        markAsChanged("FORNECEDOR", fornecedor);
        this.fornecedor = fornecedor;
   }

   public String getGrupoAutor() {
        return grupoAutor;
   }

   public void setGrupoAutor(String grupoAutor) {
        markAsChanged("GRUPOAUTOR", grupoAutor);
        this.grupoAutor = grupoAutor;
   }

   public String getHomePage() {
        return homePage;
   }

   public void setHomePage(String homePage) {
        markAsChanged("HOMEPAGE", homePage);
        this.homePage = homePage;
   }

   public String getECompra() {
        return eCompra;
   }

   public void setECompra(String eCompra) {
        markAsChanged("ECOMPRA", eCompra);
        this.eCompra = eCompra;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public BigDecimal getCodEnqIpISai() {
        return codEnqIpISai;
   }

   public void setCodEnqIpISai(BigDecimal codEnqIpISai) {
        markAsChanged("CODENQIPISAI", codEnqIpISai);
        this.codEnqIpISai = codEnqIpISai;
   }

   public BigDecimal getCodEnqIpIEnt() {
        return codEnqIpIEnt;
   }

   public void setCodEnqIpIEnt(BigDecimal codEnqIpIEnt) {
        markAsChanged("CODENQIPIENT", codEnqIpIEnt);
        this.codEnqIpIEnt = codEnqIpIEnt;
   }

   public String getIdEstrangeiro() {
        return idEstrangeiro;
   }

   public void setIdEstrangeiro(String idEstrangeiro) {
        markAsChanged("IDESTRANGEIRO", idEstrangeiro);
        this.idEstrangeiro = idEstrangeiro;
   }

   public String getTipGerBolCent() {
        return tipGerBolCent;
   }

   public void setTipGerBolCent(String tipGerBolCent) {
        markAsChanged("TIPGERBOLCENT", tipGerBolCent);
        this.tipGerBolCent = tipGerBolCent;
   }

   public String getComoConheceu() {
        return comoConheceu;
   }

   public void setComoConheceu(String comoConheceu) {
        markAsChanged("COMOCONHECEU", comoConheceu);
        this.comoConheceu = comoConheceu;
   }

   public BigDecimal getSitCadSefaz() {
        return sitCadSefaz;
   }

   public void setSitCadSefaz(BigDecimal sitCadSefaz) {
        markAsChanged("SITCADSEFAZ", sitCadSefaz);
        this.sitCadSefaz = sitCadSefaz;
   }

   public String getTimProprieta() {
        return timProprieta;
   }

   public void setTimProprieta(String timProprieta) {
        markAsChanged("TIMPROPRIETA", timProprieta);
        this.timProprieta = timProprieta;
   }

   public String getTimPropVenda() {
        return timPropVenda;
   }

   public void setTimPropVenda(String timPropVenda) {
        markAsChanged("TIMPROPVENDA", timPropVenda);
        this.timPropVenda = timPropVenda;
   }

   public String getTimQuerComprar() {
        return timQuerComprar;
   }

   public void setTimQuerComprar(String timQuerComprar) {
        markAsChanged("TIMQUERCOMPRAR", timQuerComprar);
        this.timQuerComprar = timQuerComprar;
   }

   public String getTimReferencia01() {
        return timReferencia01;
   }

   public void setTimReferencia01(String timReferencia01) {
        markAsChanged("TIMREFERENCIA01", timReferencia01);
        this.timReferencia01 = timReferencia01;
   }

   public String getTimReferencia02() {
        return timReferencia02;
   }

   public void setTimReferencia02(String timReferencia02) {
        markAsChanged("TIMREFERENCIA02", timReferencia02);
        this.timReferencia02 = timReferencia02;
   }

   public String getTimSenhaDesc() {
        return timSenhaDesc;
   }

   public void setTimSenhaDesc(String timSenhaDesc) {
        markAsChanged("TIMSENHADESC", timSenhaDesc);
        this.timSenhaDesc = timSenhaDesc;
   }

   public String getTimSenhaSite() {
        return timSenhaSite;
   }

   public void setTimSenhaSite(String timSenhaSite) {
        markAsChanged("TIMSENHASITE", timSenhaSite);
        this.timSenhaSite = timSenhaSite;
   }

   public String getTimTelefone01() {
        return timTelefone01;
   }

   public void setTimTelefone01(String timTelefone01) {
        markAsChanged("TIMTELEFONE01", timTelefone01);
        this.timTelefone01 = timTelefone01;
   }

   public String getTimTelefone02() {
        return timTelefone02;
   }

   public void setTimTelefone02(String timTelefone02) {
        markAsChanged("TIMTELEFONE02", timTelefone02);
        this.timTelefone02 = timTelefone02;
   }

   public String getTimTipoMoradia() {
        return timTipoMoradia;
   }

   public void setTimTipoMoradia(String timTipoMoradia) {
        markAsChanged("TIMTIPOMORADIA", timTipoMoradia);
        this.timTipoMoradia = timTipoMoradia;
   }

   public String getTruncParcela() {
        return truncParcela;
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
        this.truncParcela = truncParcela;
   }

   public String getVlrLiqItemNfce() {
        return vlrLiqItemNfce;
   }

   public void setVlrLiqItemNfce(String vlrLiqItemNfce) {
        markAsChanged("VLRLIQITEMNFCE", vlrLiqItemNfce);
        this.vlrLiqItemNfce = vlrLiqItemNfce;
   }

   public String getVlrLiqItemNfe() {
        return vlrLiqItemNfe;
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
        this.vlrLiqItemNfe = vlrLiqItemNfe;
   }

   public String getEnviaDanfeRedespacho() {
        return enviaDanfeRedespacho;
   }

   public void setEnviaDanfeRedespacho(String enviaDanfeRedespacho) {
        markAsChanged("ENVIADANFEREDESPACHO", enviaDanfeRedespacho);
        this.enviaDanfeRedespacho = enviaDanfeRedespacho;
   }

   public String getExigContatoEntCab() {
        return exigContatoEntCab;
   }

   public void setExigContatoEntCab(String exigContatoEntCab) {
        markAsChanged("EXIGCONTATOENTCAB", exigContatoEntCab);
        this.exigContatoEntCab = exigContatoEntCab;
   }

   public String getParcSubstIss() {
        return parcSubstIss;
   }

   public void setParcSubstIss(String parcSubstIss) {
        markAsChanged("PARCSUBSTISS", parcSubstIss);
        this.parcSubstIss = parcSubstIss;
   }

   public String getArredPrimeiraParc() {
        return arredPrimeiraParc;
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
        this.arredPrimeiraParc = arredPrimeiraParc;
   }

   public String getAssociacaoDesp() {
        return associacaoDesp;
   }

   public void setAssociacaoDesp(String associacaoDesp) {
        markAsChanged("ASSOCIACAODESP", associacaoDesp);
        this.associacaoDesp = associacaoDesp;
   }

   public String getCnae() {
        return cnae;
   }

   public void setCnae(String cnae) {
        markAsChanged("CNAE", cnae);
        this.cnae = cnae;
   }

   public BigDecimal getCodContatoPadCot() {
        return codContatoPadCot;
   }

   public void setCodContatoPadCot(BigDecimal codContatoPadCot) {
        markAsChanged("CODCONTATOPADCOT", codContatoPadCot);
        this.codContatoPadCot = codContatoPadCot;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodParcGruEconomico() {
        return codParcGruEconomico;
   }

   public void setCodParcGruEconomico(BigDecimal codParcGruEconomico) {
        markAsChanged("CODPARCGRUECONOMICO", codParcGruEconomico);
        this.codParcGruEconomico = codParcGruEconomico;
   }

   public String getCpfProdRural() {
        return cpfProdRural;
   }

   public void setCpfProdRural(String cpfProdRural) {
        markAsChanged("CPFPRODRURAL", cpfProdRural);
        this.cpfProdRural = cpfProdRural;
   }

   public Timestamp getDhCadRf() {
        return dhCadRf;
   }

   public void setDhCadRf(Timestamp dhCadRf) {
        markAsChanged("DHCADRF", dhCadRf);
        this.dhCadRf = dhCadRf;
   }

   public Timestamp getDtBaixa() {
        return dtBaixa;
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        markAsChanged("DTBAIXA", dtBaixa);
        this.dtBaixa = dtBaixa;
   }

   public Timestamp getDtIniAtiv() {
        return dtIniAtiv;
   }

   public void setDtIniAtiv(Timestamp dtIniAtiv) {
        markAsChanged("DTINIATIV", dtIniAtiv);
        this.dtIniAtiv = dtIniAtiv;
   }

   public Timestamp getDtUltSit() {
        return dtUltSit;
   }

   public void setDtUltSit(Timestamp dtUltSit) {
        markAsChanged("DTULTSIT", dtUltSit);
        this.dtUltSit = dtUltSit;
   }

   public String getEmailNfse() {
        return emailNfse;
   }

   public void setEmailNfse(String emailNfse) {
        markAsChanged("EMAILNFSE", emailNfse);
        this.emailNfse = emailNfse;
   }

   public String getEnqArt227() {
        return enqArt227;
   }

   public void setEnqArt227(String enqArt227) {
        markAsChanged("ENQART227", enqArt227);
        this.enqArt227 = enqArt227;
   }

   public BigDecimal getIndCredCte() {
        return indCredCte;
   }

   public void setIndCredCte(BigDecimal indCredCte) {
        markAsChanged("INDCREDCTE", indCredCte);
        this.indCredCte = indCredCte;
   }

   public BigDecimal getIndCredNfe() {
        return indCredNfe;
   }

   public void setIndCredNfe(BigDecimal indCredNfe) {
        markAsChanged("INDCREDNFE", indCredNfe);
        this.indCredNfe = indCredNfe;
   }

   public BigDecimal getIndOpCcp() {
        return indOpCcp;
   }

   public void setIndOpCcp(BigDecimal indOpCcp) {
        markAsChanged("INDOPCCP", indOpCcp);
        this.indOpCcp = indOpCcp;
   }

   public BigDecimal getModeloNotaCompra() {
        return modeloNotaCompra;
   }

   public void setModeloNotaCompra(BigDecimal modeloNotaCompra) {
        markAsChanged("MODELONOTACOMPRA", modeloNotaCompra);
        this.modeloNotaCompra = modeloNotaCompra;
   }

   public BigDecimal getNuFop() {
        return nuFop;
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
        this.nuFop = nuFop;
   }

   public String getOrgPublNfse() {
        return orgPublNfse;
   }

   public void setOrgPublNfse(String orgPublNfse) {
        markAsChanged("ORGPUBLNFSE", orgPublNfse);
        this.orgPublNfse = orgPublNfse;
   }

   public String getParcInter() {
        return parcInter;
   }

   public void setParcInter(String parcInter) {
        markAsChanged("PARCINTER", parcInter);
        this.parcInter = parcInter;
   }

   public String getRegApur() {
        return regApur;
   }

   public void setRegApur(String regApur) {
        markAsChanged("REGAPUR", regApur);
        this.regApur = regApur;
   }

   public BigDecimal getSitCadRf() {
        return sitCadRf;
   }

   public void setSitCadRf(BigDecimal sitCadRf) {
        markAsChanged("SITCADRF", sitCadRf);
        this.sitCadRf = sitCadRf;
   }

   public BigDecimal getTimAInvestir() {
        return timAInvestir;
   }

   public void setTimAInvestir(BigDecimal timAInvestir) {
        markAsChanged("TIMAINVESTIR", timAInvestir);
        this.timAInvestir = timAInvestir;
   }

   public BigDecimal getTimBairroCompra() {
        return timBairroCompra;
   }

   public void setTimBairroCompra(BigDecimal timBairroCompra) {
        markAsChanged("TIMBAIRROCOMPRA", timBairroCompra);
        this.timBairroCompra = timBairroCompra;
   }

   public BigDecimal getTimCartorio() {
        return timCartorio;
   }

   public void setTimCartorio(BigDecimal timCartorio) {
        markAsChanged("TIMCARTORIO", timCartorio);
        this.timCartorio = timCartorio;
   }

   public String getTimCartRegimeBensV() {
        return timCartRegimeBensV;
   }

   public void setTimCartRegimeBensV(String timCartRegimeBensV) {
        markAsChanged("TIMCARTREGIMEBENSV", timCartRegimeBensV);
        this.timCartRegimeBensV = timCartRegimeBensV;
   }

   public String getTimComprador() {
        return timComprador;
   }

   public void setTimComprador(String timComprador) {
        markAsChanged("TIMCOMPRADOR", timComprador);
        this.timComprador = timComprador;
   }

   public String getTimCorrespBancario() {
        return timCorrespBancario;
   }

   public void setTimCorrespBancario(String timCorrespBancario) {
        markAsChanged("TIMCORRESPBANCARIO", timCorrespBancario);
        this.timCorrespBancario = timCorrespBancario;
   }

   public String getTimCorretor() {
        return timCorretor;
   }

   public void setTimCorretor(String timCorretor) {
        markAsChanged("TIMCORRETOR", timCorretor);
        this.timCorretor = timCorretor;
   }

   public Timestamp getTimDataCi() {
        return timDataCi;
   }

   public void setTimDataCi(Timestamp timDataCi) {
        markAsChanged("TIMDATACI", timDataCi);
        this.timDataCi = timDataCi;
   }

   public String getTimEstadoCivil() {
        return timEstadoCivil;
   }

   public void setTimEstadoCivil(String timEstadoCivil) {
        markAsChanged("TIMESTADOCIVIL", timEstadoCivil);
        this.timEstadoCivil = timEstadoCivil;
   }

   public String getTimFaixaSalarial() {
        return timFaixaSalarial;
   }

   public void setTimFaixaSalarial(String timFaixaSalarial) {
        markAsChanged("TIMFAIXASALARIAL", timFaixaSalarial);
        this.timFaixaSalarial = timFaixaSalarial;
   }

   public String getTimFiador() {
        return timFiador;
   }

   public void setTimFiador(String timFiador) {
        markAsChanged("TIMFIADOR", timFiador);
        this.timFiador = timFiador;
   }

   public String getTimInquilino() {
        return timInquilino;
   }

   public void setTimInquilino(String timInquilino) {
        markAsChanged("TIMINQUILINO", timInquilino);
        this.timInquilino = timInquilino;
   }

   public String getTimMae() {
        return timMae;
   }

   public void setTimMae(String timMae) {
        markAsChanged("TIMMAE", timMae);
        this.timMae = timMae;
   }

   public BigDecimal getTimNacionalidad() {
        return timNacionalidad;
   }

   public void setTimNacionalidad(BigDecimal timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
        this.timNacionalidad = timNacionalidad;
   }

   public String getTimOrgao() {
        return timOrgao;
   }

   public void setTimOrgao(String timOrgao) {
        markAsChanged("TIMORGAO", timOrgao);
        this.timOrgao = timOrgao;
   }

   public String getTimOutTels() {
        return timOutTels;
   }

   public void setTimOutTels(String timOutTels) {
        markAsChanged("TIMOUTTELS", timOutTels);
        this.timOutTels = timOutTels;
   }

   public String getTimPai() {
        return timPai;
   }

   public void setTimPai(String timPai) {
        markAsChanged("TIMPAI", timPai);
        this.timPai = timPai;
   }

   public BigDecimal getTimProfissao() {
        return timProfissao;
   }

   public void setTimProfissao(BigDecimal timProfissao) {
        markAsChanged("TIMPROFISSAO", timProfissao);
        this.timProfissao = timProfissao;
   }

   public String getCalcFetHab() {
        return calcFetHab;
   }

   public void setCalcFetHab(String calcFetHab) {
        markAsChanged("CALCFETHAB", calcFetHab);
        this.calcFetHab = calcFetHab;
   }

   public String getAplicLeiTransp() {
        return aplicLeiTransp;
   }

   public void setAplicLeiTransp(String aplicLeiTransp) {
        markAsChanged("APLICLEITRANSP", aplicLeiTransp);
        this.aplicLeiTransp = aplicLeiTransp;
   }

   public String getEmailNotifEntrega() {
        return emailNotifEntrega;
   }

   public void setEmailNotifEntrega(String emailNotifEntrega) {
        markAsChanged("EMAILNOTIFENTREGA", emailNotifEntrega);
        this.emailNotifEntrega = emailNotifEntrega;
   }

   public String getImpAgrupFin() {
        return impAgrupFin;
   }

   public void setImpAgrupFin(String impAgrupFin) {
        markAsChanged("IMPAGRUPFIN", impAgrupFin);
        this.impAgrupFin = impAgrupFin;
   }

   public String getIndAquisicao() {
        return indAquisicao;
   }

   public void setIndAquisicao(String indAquisicao) {
        markAsChanged("INDAQUISICAO", indAquisicao);
        this.indAquisicao = indAquisicao;
   }

   public String getIndComercializacao() {
        return indComercializacao;
   }

   public void setIndComercializacao(String indComercializacao) {
        markAsChanged("INDCOMERCIALIZACAO", indComercializacao);
        this.indComercializacao = indComercializacao;
   }

   public BigDecimal getUniDImport() {
        return uniDImport;
   }

   public void setUniDImport(BigDecimal uniDImport) {
        markAsChanged("UNIDIMPORT", uniDImport);
        this.uniDImport = uniDImport;
   }

   public String getInscMun() {
        return inscMun;
   }

   public void setInscMun(String inscMun) {
        markAsChanged("INSCMUN", inscMun);
        this.inscMun = inscMun;
   }

   public String getIpiInciCms() {
        return ipiInciCms;
   }

   public void setIpiInciCms(String ipiInciCms) {
        markAsChanged("IPIINCICMS", ipiInciCms);
        this.ipiInciCms = ipiInciCms;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
        this.latitude = latitude;
   }

   public BigDecimal getLimCred() {
        return limCred;
   }

   public void setLimCred(BigDecimal limCred) {
        markAsChanged("LIMCRED", limCred);
        this.limCred = limCred;
   }

   public BigDecimal getLimCredMensal() {
        return limCredMensal;
   }

   public void setLimCredMensal(BigDecimal limCredMensal) {
        markAsChanged("LIMCREDMENSAL", limCredMensal);
        this.limCredMensal = limCredMensal;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
        this.longitude = longitude;
   }

   public String getMedico() {
        return medico;
   }

   public void setMedico(String medico) {
        markAsChanged("MEDICO", medico);
        this.medico = medico;
   }

   public String getMeiRj() {
        return meiRj;
   }

   public void setMeiRj(String meiRj) {
        markAsChanged("MEIRJ", meiRj);
        this.meiRj = meiRj;
   }

   public String getModeloNfDes() {
        return modeloNfDes;
   }

   public void setModeloNfDes(String modeloNfDes) {
        markAsChanged("MODELONFDES", modeloNfDes);
        this.modeloNfDes = modeloNfDes;
   }

   public String getMotBloq() {
        return motBloq;
   }

   public void setMotBloq(String motBloq) {
        markAsChanged("MOTBLOQ", motBloq);
        this.motBloq = motBloq;
   }

   public String getMotorista() {
        return motorista;
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
        this.motorista = motorista;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
        this.naturezaOperDes = naturezaOperDes;
   }

   public String getNomeAge() {
        return nomeAge;
   }

   public void setNomeAge(String nomeAge) {
        markAsChanged("NOMEAGE", nomeAge);
        this.nomeAge = nomeAge;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
        this.nomeParc = nomeParc;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
        this.numEnd = numEnd;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
        this.observacoes = observacoes;
   }

   public String getOperLogist() {
        return operLogist;
   }

   public void setOperLogist(String operLogist) {
        markAsChanged("OPERLOGIST", operLogist);
        this.operLogist = operLogist;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
        this.percCusVar = percCusVar;
   }

   public BigDecimal getPercDescEspecial() {
        return percDescEspecial;
   }

   public void setPercDescEspecial(BigDecimal percDescEspecial) {
        markAsChanged("PERCDESCESPECIAL", percDescEspecial);
        this.percDescEspecial = percDescEspecial;
   }

   public BigDecimal getPercJuro() {
        return percJuro;
   }

   public void setPercJuro(BigDecimal percJuro) {
        markAsChanged("PERCJURO", percJuro);
        this.percJuro = percJuro;
   }

   public BigDecimal getPercMulta() {
        return percMulta;
   }

   public void setPercMulta(BigDecimal percMulta) {
        markAsChanged("PERCMULTA", percMulta);
        this.percMulta = percMulta;
   }

   public BigDecimal getPotencialNeg() {
        return potencialNeg;
   }

   public void setPotencialNeg(BigDecimal potencialNeg) {
        markAsChanged("POTENCIALNEG", potencialNeg);
        this.potencialNeg = potencialNeg;
   }

   public BigDecimal getPrazoContato() {
        return prazoContato;
   }

   public void setPrazoContato(BigDecimal prazoContato) {
        markAsChanged("PRAZOCONTATO", prazoContato);
        this.prazoContato = prazoContato;
   }

   public BigDecimal getPrazoPag() {
        return prazoPag;
   }

   public void setPrazoPag(BigDecimal prazoPag) {
        markAsChanged("PRAZOPAG", prazoPag);
        this.prazoPag = prazoPag;
   }

   public String getProdutorTemNf() {
        return produtorTemNf;
   }

   public void setProdutorTemNf(String produtorTemNf) {
        markAsChanged("PRODUTORTEMNF", produtorTemNf);
        this.produtorTemNf = produtorTemNf;
   }

   public String getProfessor() {
        return professor;
   }

   public void setProfessor(String professor) {
        markAsChanged("PROFESSOR", professor);
        this.professor = professor;
   }

   public BigDecimal getQtdMaxPedCpa() {
        return qtdMaxPedCpa;
   }

   public void setQtdMaxPedCpa(BigDecimal qtdMaxPedCpa) {
        markAsChanged("QTDMAXPEDCPA", qtdMaxPedCpa);
        this.qtdMaxPedCpa = qtdMaxPedCpa;
   }

   public BigDecimal getQtdMaxTitVencidos() {
        return qtdMaxTitVencidos;
   }

   public void setQtdMaxTitVencidos(BigDecimal qtdMaxTitVencidos) {
        markAsChanged("QTDMAXTITVENCIDOS", qtdMaxTitVencidos);
        this.qtdMaxTitVencidos = qtdMaxTitVencidos;
   }

   public BigDecimal getRamal() {
        return ramal;
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
        this.ramal = ramal;
   }

   public String getRazaoSocial() {
        return razaoSocial;
   }

   public void setRazaoSocial(String razaoSocial) {
        markAsChanged("RAZAOSOCIAL", razaoSocial);
        this.razaoSocial = razaoSocial;
   }

   public String getRetemCofins() {
        return retemCofins;
   }

   public void setRetemCofins(String retemCofins) {
        markAsChanged("RETEMCOFINS", retemCofins);
        this.retemCofins = retemCofins;
   }

   public String getRetemCsl() {
        return retemCsl;
   }

   public void setRetemCsl(String retemCsl) {
        markAsChanged("RETEMCSL", retemCsl);
        this.retemCsl = retemCsl;
   }

   public String getRetemInss() {
        return retemInss;
   }

   public void setRetemInss(String retemInss) {
        markAsChanged("RETEMINSS", retemInss);
        this.retemInss = retemInss;
   }

   public String getRetemIss() {
        return retemIss;
   }

   public void setRetemIss(String retemIss) {
        markAsChanged("RETEMISS", retemIss);
        this.retemIss = retemIss;
   }

   public String getRetemPis() {
        return retemPis;
   }

   public void setRetemPis(String retemPis) {
        markAsChanged("RETEMPIS", retemPis);
        this.retemPis = retemPis;
   }

   public String getRetStVenda() {
        return retStVenda;
   }

   public void setRetStVenda(String retStVenda) {
        markAsChanged("RETSTVENDA", retStVenda);
        this.retStVenda = retStVenda;
   }

   public String getSelecionado() {
        return selecionado;
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
        this.selecionado = selecionado;
   }

   public String getSerieNfDes() {
        return serieNfDes;
   }

   public void setSerieNfDes(String serieNfDes) {
        markAsChanged("SERIENFDES", serieNfDes);
        this.serieNfDes = serieNfDes;
   }

   public String getSexo() {
        return sexo;
   }

   public void setSexo(String sexo) {
        markAsChanged("SEXO", sexo);
        this.sexo = sexo;
   }

   public String getSimples() {
        return simples;
   }

   public void setSimples(String simples) {
        markAsChanged("SIMPLES", simples);
        this.simples = simples;
   }

   public String getSitCcf() {
        return sitCcf;
   }

   public void setSitCcf(String sitCcf) {
        markAsChanged("SITCCF", sitCcf);
        this.sitCcf = sitCcf;
   }

   public String getSitReceita() {
        return sitReceita;
   }

   public void setSitReceita(String sitReceita) {
        markAsChanged("SITRECEITA", sitReceita);
        this.sitReceita = sitReceita;
   }

   public String getSitSintegra() {
        return sitSintegra;
   }

   public void setSitSintegra(String sitSintegra) {
        markAsChanged("SITSINTEGRA", sitSintegra);
        this.sitSintegra = sitSintegra;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getStatusEdz() {
        return statusEdz;
   }

   public void setStatusEdz(String statusEdz) {
        markAsChanged("STATUSEDZ", statusEdz);
        this.statusEdz = statusEdz;
   }

   public String getTare() {
        return tare;
   }

   public void setTare(String tare) {
        markAsChanged("TARE", tare);
        this.tare = tare;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
   }

   public String getTemIpi() {
        return temIpi;
   }

   public void setTemIpi(String temIpi) {
        markAsChanged("TEMIPI", temIpi);
        this.temIpi = temIpi;
   }

   public String getTipAnexoNfe() {
        return tipAnexoNfe;
   }

   public void setTipAnexoNfe(String tipAnexoNfe) {
        markAsChanged("TIPANEXONFE", tipAnexoNfe);
        this.tipAnexoNfe = tipAnexoNfe;
   }

   public String getTipJuro() {
        return tipJuro;
   }

   public void setTipJuro(String tipJuro) {
        markAsChanged("TIPJURO", tipJuro);
        this.tipJuro = tipJuro;
   }

   public String getTipoFatur() {
        return tipoFatur;
   }

   public void setTipoFatur(String tipoFatur) {
        markAsChanged("TIPOFATUR", tipoFatur);
        this.tipoFatur = tipoFatur;
   }

   public String getTipoGerBoleto() {
        return tipoGerBoleto;
   }

   public void setTipoGerBoleto(String tipoGerBoleto) {
        markAsChanged("TIPOGERBOLETO", tipoGerBoleto);
        this.tipoGerBoleto = tipoGerBoleto;
   }

   public String getTipoPessoa() {
        return tipoPessoa;
   }

   public void setTipoPessoa(String tipoPessoa) {
        markAsChanged("TIPPESSOA", tipoPessoa);
        this.tipoPessoa = tipoPessoa;
   }

   public BigDecimal getTolerInadImp() {
        return tolerInadImp;
   }

   public void setTolerInadImp(BigDecimal tolerInadImp) {
        markAsChanged("TOLERINADIMP", tolerInadImp);
        this.tolerInadImp = tolerInadImp;
   }

   public String getTransportadora() {
        return transportadora;
   }

   public void setTransportadora(String transportadora) {
        markAsChanged("TRANSPORTADORA", transportadora);
        this.transportadora = transportadora;
   }

   public String getUsaTabCrForn() {
        return usaTabCrForn;
   }

   public void setUsaTabCrForn(String usaTabCrForn) {
        markAsChanged("USATABCRFORN", usaTabCrForn);
        this.usaTabCrForn = usaTabCrForn;
   }

   public String getUsuario() {
        return usuario;
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
        this.usuario = usuario;
   }

   public String getValDescGrdCar() {
        return valDescGrdCar;
   }

   public void setValDescGrdCar(String valDescGrdCar) {
        markAsChanged("VALDESCGRDCAR", valDescGrdCar);
        this.valDescGrdCar = valDescGrdCar;
   }

   public String getVendedor() {
        return vendedor;
   }

   public void setVendedor(String vendedor) {
        markAsChanged("VENDEDOR", vendedor);
        this.vendedor = vendedor;
   }

   public BigDecimal getVlrMinPedCpa() {
        return vlrMinPedCpa;
   }

   public void setVlrMinPedCpa(BigDecimal vlrMinPedCpa) {
        markAsChanged("VLRMINPEDCPA", vlrMinPedCpa);
        this.vlrMinPedCpa = vlrMinPedCpa;
   }

   public String getTermAcord() {
        return termAcord;
   }

   public void setTermAcord(String termAcord) {
        markAsChanged("TERMACORD", termAcord);
        this.termAcord = termAcord;
   }

   public BigDecimal getIntervAnalisCred() {
        return intervAnalisCred;
   }

   public void setIntervAnalisCred(BigDecimal intervAnalisCred) {
        markAsChanged("INTERVANALISCRED", intervAnalisCred);
        this.intervAnalisCred = intervAnalisCred;
   }

   public BigDecimal getVendaMin() {
        return vendaMin;
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
        this.vendaMin = vendaMin;
   }

   public String getTranspPropria() {
        return transpPropria;
   }

   public void setTranspPropria(String transpPropria) {
        markAsChanged("TRANSPPROPRIA", transpPropria);
        this.transpPropria = transpPropria;
   }

   public String getExigeNomeParc() {
        return exigeNomeParc;
   }

   public void setExigeNomeParc(String exigeNomeParc) {
        markAsChanged("EXIGENOMEPARC", exigeNomeParc);
        this.exigeNomeParc = exigeNomeParc;
   }

   public String getEstabTransp() {
        return estabTransp;
   }

   public void setEstabTransp(String estabTransp) {
        markAsChanged("ESTABTRANSP", estabTransp);
        this.estabTransp = estabTransp;
   }

   public Timestamp getDtEmisNfeForn() {
        return dtEmisNfeForn;
   }

   public void setDtEmisNfeForn(Timestamp dtEmisNfeForn) {
        markAsChanged("DTEMISNFEFORN", dtEmisNfeForn);
        this.dtEmisNfeForn = dtEmisNfeForn;
   }

   public BigDecimal getPercRedInss() {
        return percRedInss;
   }

   public void setPercRedInss(BigDecimal percRedInss) {
        markAsChanged("PERCREDINSS", percRedInss);
        this.percRedInss = percRedInss;
   }

   public BigDecimal getDiaPagtoEconect() {
        return diaPagtoEconect;
   }

   public void setDiaPagtoEconect(BigDecimal diaPagtoEconect) {
        markAsChanged("DIAPAGTOECONECT", diaPagtoEconect);
        this.diaPagtoEconect = diaPagtoEconect;
   }

   public BigDecimal getDiaFechaEconect() {
        return diaFechaEconect;
   }

   public void setDiaFechaEconect(BigDecimal diaFechaEconect) {
        markAsChanged("DIAFECHAECONECT", diaFechaEconect);
        this.diaFechaEconect = diaFechaEconect;
   }

   public String getIntegraEconect() {
        return integraEconect;
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
        this.integraEconect = integraEconect;
   }

   public BigDecimal getBaseParceleConect() {
        return baseParceleConect;
   }

   public void setBaseParceleConect(BigDecimal baseParceleConect) {
        markAsChanged("BASEPARCELECONECT", baseParceleConect);
        this.baseParceleConect = baseParceleConect;
   }

   public String getSenhaEconect() {
        return senhaEconect;
   }

   public void setSenhaEconect(String senhaEconect) {
        markAsChanged("SENHAECONECT", senhaEconect);
        this.senhaEconect = senhaEconect;
   }

   public String getPrazoParcEconect() {
        return prazoParcEconect;
   }

   public void setPrazoParcEconect(String prazoParcEconect) {
        markAsChanged("PRAZOPARCECONECT", prazoParcEconect);
        this.prazoParcEconect = prazoParcEconect;
   }

   public String getParcelaMeConect() {
        return parcelaMeConect;
   }

   public void setParcelaMeConect(String parcelaMeConect) {
        markAsChanged("PARCELAMECONECT", parcelaMeConect);
        this.parcelaMeConect = parcelaMeConect;
   }

   public String getPerfilEconect() {
        return perfilEconect;
   }

   public void setPerfilEconect(String perfilEconect) {
        markAsChanged("PERFILECONECT", perfilEconect);
        this.perfilEconect = perfilEconect;
   }

   public BigDecimal getBasePrazoEconect() {
        return basePrazoEconect;
   }

   public void setBasePrazoEconect(BigDecimal basePrazoEconect) {
        markAsChanged("BASEPRAZOECONECT", basePrazoEconect);
        this.basePrazoEconect = basePrazoEconect;
   }

   public String getTiposParc() {
        return tiposParc;
   }

   public void setTiposParc(String tiposParc) {
        markAsChanged("TIPOSPARC", tiposParc);
        this.tiposParc = tiposParc;
   }

   public String getEnviaPedEmailTop() {
        return enviaPedEmailTop;
   }

   public void setEnviaPedEmailTop(String enviaPedEmailTop) {
        markAsChanged("ENVIPEDEMAILTOP", enviaPedEmailTop);
        this.enviaPedEmailTop = enviaPedEmailTop;
   }

   public String getMotNaoReterIssqn() {
        return motNaoReterIssqn;
   }

   public void setMotNaoReterIssqn(String motNaoReterIssqn) {
        markAsChanged("MOTNAORETERISSQN", motNaoReterIssqn);
        this.motNaoReterIssqn = motNaoReterIssqn;
   }

   public String getSitEspecialResp() {
        return sitEspecialResp;
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        markAsChanged("SITESPECIALRESP", sitEspecialResp);
        this.sitEspecialResp = sitEspecialResp;
   }

   public BigDecimal getProvAcresc() {
        return provAcresc;
   }

   public void setProvAcresc(BigDecimal provAcresc) {
        markAsChanged("PROVACRESC", provAcresc);
        this.provAcresc = provAcresc;
   }

   public BigDecimal getSaldoDisp() {
        return saldoDisp;
   }

   public void setSaldoDisp(BigDecimal saldoDisp) {
        markAsChanged("SALDODISP", saldoDisp);
        this.saldoDisp = saldoDisp;
   }

   public String getTipLotacao() {
        return tipLotacao;
   }

   public void setTipLotacao(String tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
        this.tipLotacao = tipLotacao;
   }

   public String getChavePix() {
        return chavePix;
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
        this.chavePix = chavePix;
   }

   public String getDesconsideraDescBase() {
        return desconsideraDescBase;
   }

   public void setDesconsideraDescBase(String desconsideraDescBase) {
        markAsChanged("DESCONSIDESCBASE", desconsideraDescBase);
        this.desconsideraDescBase = desconsideraDescBase;
   }

   public BigDecimal getCodIdentCons() {
        return codIdentCons;
   }

   public void setCodIdentCons(BigDecimal codIdentCons) {
        markAsChanged("CODIDENTCONS", codIdentCons);
        this.codIdentCons = codIdentCons;
   }

   public BigDecimal getTipClienteServCom() {
        return tipClienteServCom;
   }

   public void setTipClienteServCom(BigDecimal tipClienteServCom) {
        markAsChanged("TIPCLIENTESERVCOM", tipClienteServCom);
        this.tipClienteServCom = tipClienteServCom;
   }

   public String getUtilizaNucadParc() {
        return utilizaNucadParc;
   }

   public void setUtilizaNucadParc(String utilizaNucadParc) {
        markAsChanged("UTILIZANUCADPARC", utilizaNucadParc);
        this.utilizaNucadParc = utilizaNucadParc;
   }

   public BigDecimal getProvAcrescCac() {
        return provAcrescCac;
   }

   public void setProvAcrescCac(BigDecimal provAcrescCac) {
        markAsChanged("PROVACRESCCAC", provAcrescCac);
        this.provAcrescCac = provAcrescCac;
   }

   public BigDecimal getSaldoDispCac() {
        return saldoDispCac;
   }

   public void setSaldoDispCac(BigDecimal saldoDispCac) {
        markAsChanged("SALDODISPCAC", saldoDispCac);
        this.saldoDispCac = saldoDispCac;
   }

   public String getAtNuVersao() {
        return atNuVersao;
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
        this.atNuVersao = atNuVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
        this.nuVersao = nuVersao;
   }

   public String getConsidTotItensTrib() {
        return considTotItensTrib;
   }

   public void setConsidTotItensTrib(String considTotItensTrib) {
        markAsChanged("CONSIDTOTITENSTRIB", considTotItensTrib);
        this.considTotItensTrib = considTotItensTrib;
   }

   public String getDeduzIpiBcPisCf() {
        return deduzIpiBcPisCf;
   }

   public void setDeduzIpiBcPisCf(String deduzIpiBcPisCf) {
        markAsChanged("DEDUZIPIBCPISCF", deduzIpiBcPisCf);
        this.deduzIpiBcPisCf = deduzIpiBcPisCf;
   }

   public String getConsParcAdrCst() {
        return consParcAdrCst;
   }

   public void setConsParcAdrCst(String consParcAdrCst) {
        markAsChanged("CONSPARCADRCST", consParcAdrCst);
        this.consParcAdrCst = consParcAdrCst;
   }

   public String getDescontaDescInss() {
        return descontaDescInss;
   }

   public void setDescontaDescInss(String descontaDescInss) {
        markAsChanged("DESCONSDESCINSS", descontaDescInss);
        this.descontaDescInss = descontaDescInss;
   }

   public String getEmailCte() {
        return emailCte;
   }

   public void setEmailCte(String emailCte) {
        markAsChanged("EMAILCTE", emailCte);
        this.emailCte = emailCte;
   }

   public String getRede() {
        return rede;
   }

   public void setRede(String rede) {
        markAsChanged("REDE", rede);
        this.rede = rede;
   }

   public BigDecimal getGrupoPisCofins() {
        return grupoPisCofins;
   }

   public void setGrupoPisCofins(BigDecimal grupoPisCofins) {
        markAsChanged("GRUPOPISCOFINS", grupoPisCofins);
        this.grupoPisCofins = grupoPisCofins;
   }

   @Override
   public String getTableName() {
        return "TGFPAR";
   }

   @Override
   public String getEntityName() {
        return "ParceiroDestino";
   }

   @Override
   public ParceiroDestino fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.identInscEstad = vo.asString("IDENTINSCESTAD");
        this.implAudolote = vo.asString("IMPLAUDOLOTE");
        this.indNatRet = vo.asString("INDNATRET");
        this.inscEstadNauf = vo.asString("INSCESTADNAUF");
        this.agencia = vo.asString("AGENCIA");
        this.agronomo = vo.asString("AGRONOMO");
        this.agrupar = vo.asString("AGRUPAR");
        this.aliqIssRetSimples = vo.asBigDecimal("ALIQISSRETSIMPLES");
        this.aluno = vo.asString("ALUNO");
        this.ativo = vo.asString("ATIVO");
        this.bloquear = vo.asString("BLOQUEAR");
        this.caixaPostal = vo.asString("CAIXAPOSTAL");
        this.calcInss = vo.asString("CALCINSS");
        this.cei = vo.asString("CEI");
        this.cep = vo.asString("CEP");
        this.cgcCpf = vo.asString("CGC_CPF");
        this.classificMs = vo.asString("CLASSIFICMS");
        this.cliente = vo.asString("CLIENTE");
        this.codAge = vo.asString("CODAGE");
        this.codAnt = vo.asBigDecimal("CODANT");
        this.codAssessor = vo.asBigDecimal("CODASSESSOR");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codCred = vo.asBigDecimal("CODCRED");
        this.codCtaBco = vo.asString("CODCTABCO");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codCtaCtb2 = vo.asBigDecimal("CODCTACTB2");
        this.codCtaCtb3 = vo.asBigDecimal("CODCTACTB3");
        this.codCtaCtb4 = vo.asBigDecimal("CODCTACTB4");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpPref = vo.asBigDecimal("CODEMPPREF");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codLocalPadrao = vo.asBigDecimal("CODLOCALPADRAO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcMatriz = vo.asBigDecimal("CODPARCMATRIZ");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codRota = vo.asBigDecimal("CODROTA");
        this.codTab = vo.asBigDecimal("CODTAB");
        this.codTabSt = vo.asBigDecimal("CODTABST");
        this.codTipParc = vo.asBigDecimal("CODTIPPARC");
        this.codUniMed = vo.asString("CODUNIMED");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuCobr = vo.asBigDecimal("CODUSUCOBR");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.complemento = vo.asString("COMPLEMENTO");
        this.contAcesso = vo.asString("CONTACESSO");
        this.csTipIEnt = vo.asBigDecimal("CSTIPIENT");
        this.csTipISai = vo.asBigDecimal("CSTIPISAI");
        this.ctaAdiant = vo.asString("CTAADIANT");
        this.descBonif = vo.asString("DESCBONIF");
        this.descFin = vo.asBigDecimal("DESCFIN");
        this.descrRota = vo.asString("DESCRROTA");
        this.descStIva = vo.asString("DESCSTIVA");
        this.diaSem = vo.asBigDecimal("DIASEM");
        this.diasVarPagto = vo.asBigDecimal("DIASVARPAGTO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtCad = vo.asTimestamp("DTCAD");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.dtUltContato = vo.asTimestamp("DTULTCONTATO");
        this.dtUltNegoc = vo.asTimestamp("DTULTNEGOC");
        this.dhCadSefaz = vo.asTimestamp("DHCADSEFAZ");
        this.eVenda = vo.asString("EVENDA");
        this.fax = vo.asString("FAX");
        this.emailDanfe = vo.asString("EMAILDANFE");
        this.emailNfe = vo.asString("EMAILNFE");
        this.entregaEndContato = vo.asString("ENTREGAENDCONTATO");
        this.flex = vo.asString("FLEX");
        this.fornecedor = vo.asString("FORNECEDOR");
        this.grupoAutor = vo.asString("GRUPOAUTOR");
        this.homePage = vo.asString("HOMEPAGE");
        this.eCompra = vo.asString("ECOMPRA");
        this.email = vo.asString("EMAIL");
        this.codEnqIpISai = vo.asBigDecimal("CODENQIPISAI");
        this.codEnqIpIEnt = vo.asBigDecimal("CODENQIPIENT");
        this.idEstrangeiro = vo.asString("IDESTRANGEIRO");
        this.tipGerBolCent = vo.asString("TIPGERBOLCENT");
        this.comoConheceu = vo.asString("COMOCONHECEU");
        this.sitCadSefaz = vo.asBigDecimal("SITCADSEFAZ");
        this.timProprieta = vo.asString("TIMPROPRIETA");
        this.timPropVenda = vo.asString("TIMPROPVENDA");
        this.timQuerComprar = vo.asString("TIMQUERCOMPRAR");
        this.timReferencia01 = vo.asString("TIMREFERENCIA01");
        this.timReferencia02 = vo.asString("TIMREFERENCIA02");
        this.timSenhaDesc = vo.asString("TIMSENHADESC");
        this.timSenhaSite = vo.asString("TIMSENHASITE");
        this.timTelefone01 = vo.asString("TIMTELEFONE01");
        this.timTelefone02 = vo.asString("TIMTELEFONE02");
        this.timTipoMoradia = vo.asString("TIMTIPOMORADIA");
        this.truncParcela = vo.asString("TRUNCPARCELA");
        this.vlrLiqItemNfce = vo.asString("VLRLIQITEMNFCE");
        this.vlrLiqItemNfe = vo.asString("VLRLIQITEMNFE");
        this.enviaDanfeRedespacho = vo.asString("ENVIADANFEREDESPACHO");
        this.exigContatoEntCab = vo.asString("EXIGCONTATOENTCAB");
        this.parcSubstIss = vo.asString("PARCSUBSTISS");
        this.arredPrimeiraParc = vo.asString("ARREDPRIMEIRAPARC");
        this.associacaoDesp = vo.asString("ASSOCIACAODESP");
        this.cnae = vo.asString("CNAE");
        this.codContatoPadCot = vo.asBigDecimal("CODCONTATOPADCOT");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codParcGruEconomico = vo.asBigDecimal("CODPARCGRUECONOMICO");
        this.cpfProdRural = vo.asString("CPFPRODRURAL");
        this.dhCadRf = vo.asTimestamp("DHCADRF");
        this.dtBaixa = vo.asTimestamp("DTBAIXA");
        this.dtIniAtiv = vo.asTimestamp("DTINIATIV");
        this.dtUltSit = vo.asTimestamp("DTULTSIT");
        this.emailNfse = vo.asString("EMAILNFSE");
        this.enqArt227 = vo.asString("ENQART227");
        this.indCredCte = vo.asBigDecimal("INDCREDCTE");
        this.indCredNfe = vo.asBigDecimal("INDCREDNFE");
        this.indOpCcp = vo.asBigDecimal("INDOPCCP");
        this.modeloNotaCompra = vo.asBigDecimal("MODELONOTACOMPRA");
        this.nuFop = vo.asBigDecimal("NUFOP");
        this.orgPublNfse = vo.asString("ORGPUBLNFSE");
        this.parcInter = vo.asString("PARCINTER");
        this.regApur = vo.asString("REGAPUR");
        this.sitCadRf = vo.asBigDecimal("SITCADRF");
        this.timAInvestir = vo.asBigDecimal("TIMAINVESTIR");
        this.timBairroCompra = vo.asBigDecimal("TIMBAIRROCOMPRA");
        this.timCartorio = vo.asBigDecimal("TIMCARTORIO");
        this.timCartRegimeBensV = vo.asString("TIMCARTREGIMEBENSV");
        this.timComprador = vo.asString("TIMCOMPRADOR");
        this.timCorrespBancario = vo.asString("TIMCORRESPBANCARIO");
        this.timCorretor = vo.asString("TIMCORRETOR");
        this.timDataCi = vo.asTimestamp("TIMDATACI");
        this.timEstadoCivil = vo.asString("TIMESTADOCIVIL");
        this.timFaixaSalarial = vo.asString("TIMFAIXASALARIAL");
        this.timFiador = vo.asString("TIMFIADOR");
        this.timInquilino = vo.asString("TIMINQUILINO");
        this.timMae = vo.asString("TIMMAE");
        this.timNacionalidad = vo.asBigDecimal("TIMNACIONALIDAD");
        this.timOrgao = vo.asString("TIMORGAO");
        this.timOutTels = vo.asString("TIMOUTTELS");
        this.timPai = vo.asString("TIMPAI");
        this.timProfissao = vo.asBigDecimal("TIMPROFISSAO");
        this.calcFetHab = vo.asString("CALCFETHAB");
        this.aplicLeiTransp = vo.asString("APLICLEITRANSP");
        this.emailNotifEntrega = vo.asString("EMAILNOTIFENTREGA");
        this.impAgrupFin = vo.asString("IMPAGRUPFIN");
        this.indAquisicao = vo.asString("INDAQUISICAO");
        this.indComercializacao = vo.asString("INDCOMERCIALIZACAO");
        this.uniDImport = vo.asBigDecimal("UNIDIMPORT");
        this.inscMun = vo.asString("INSCMUN");
        this.ipiInciCms = vo.asString("IPIINCICMS");
        this.latitude = vo.asString("LATITUDE");
        this.limCred = vo.asBigDecimal("LIMCRED");
        this.limCredMensal = vo.asBigDecimal("LIMCREDMENSAL");
        this.longitude = vo.asString("LONGITUDE");
        this.medico = vo.asString("MEDICO");
        this.meiRj = vo.asString("MEIRJ");
        this.modeloNfDes = vo.asString("MODELONFDES");
        this.motBloq = vo.asString("MOTBLOQ");
        this.motorista = vo.asString("MOTORISTA");
        this.naturezaOperDes = vo.asString("NATUREZAOPERDES");
        this.nomeAge = vo.asString("NOMEAGE");
        this.nomeParc = vo.asString("NOMEPARC");
        this.numEnd = vo.asString("NUMEND");
        this.observacoes = vo.asString("OBSERVACOES");
        this.operLogist = vo.asString("OPERLOGIST");
        this.percCusVar = vo.asBigDecimal("PERCCUSVAR");
        this.percDescEspecial = vo.asBigDecimal("PERCDESCESPECIAL");
        this.percJuro = vo.asBigDecimal("PERCJURO");
        this.percMulta = vo.asBigDecimal("PERCMULTA");
        this.potencialNeg = vo.asBigDecimal("POTENCIALNEG");
        this.prazoContato = vo.asBigDecimal("PRAZOCONTATO");
        this.prazoPag = vo.asBigDecimal("PRAZOPAG");
        this.produtorTemNf = vo.asString("PRODUTORTEMNF");
        this.professor = vo.asString("PROFESSOR");
        this.qtdMaxPedCpa = vo.asBigDecimal("QTDMAXPEDCPA");
        this.qtdMaxTitVencidos = vo.asBigDecimal("QTDMAXTITVENCIDOS");
        this.ramal = vo.asBigDecimal("RAMAL");
        this.razaoSocial = vo.asString("RAZAOSOCIAL");
        this.retemCofins = vo.asString("RETEMCOFINS");
        this.retemCsl = vo.asString("RETEMCSL");
        this.retemInss = vo.asString("RETEMINSS");
        this.retemIss = vo.asString("RETEMISS");
        this.retemPis = vo.asString("RETEMPIS");
        this.retStVenda = vo.asString("RETSTVENDA");
        this.selecionado = vo.asString("SELECIONADO");
        this.serieNfDes = vo.asString("SERIENFDES");
        this.sexo = vo.asString("SEXO");
        this.simples = vo.asString("SIMPLES");
        this.sitCcf = vo.asString("SITCCF");
        this.sitReceita = vo.asString("SITRECEITA");
        this.sitSintegra = vo.asString("SITSINTEGRA");
        this.situacao = vo.asString("SITUACAO");
        this.statusEdz = vo.asString("STATUSEDZ");
        this.tare = vo.asString("TARE");
        this.telefone = vo.asString("TELEFONE");
        this.temIpi = vo.asString("TEMIPI");
        this.tipAnexoNfe = vo.asString("TIPANEXONFE");
        this.tipJuro = vo.asString("TIPJURO");
        this.tipoFatur = vo.asString("TIPOFATUR");
        this.tipoGerBoleto = vo.asString("TIPOGERBOLETO");
        this.tipoPessoa = vo.asString("TIPPESSOA");
        this.tolerInadImp = vo.asBigDecimal("TOLERINADIMP");
        this.transportadora = vo.asString("TRANSPORTADORA");
        this.usaTabCrForn = vo.asString("USATABCRFORN");
        this.usuario = vo.asString("USUARIO");
        this.valDescGrdCar = vo.asString("VALDESCGRDCAR");
        this.vendedor = vo.asString("VENDEDOR");
        this.vlrMinPedCpa = vo.asBigDecimal("VLRMINPEDCPA");
        this.termAcord = vo.asString("TERMACORD");
        this.intervAnalisCred = vo.asBigDecimal("INTERVANALISCRED");
        this.vendaMin = vo.asBigDecimal("VENDAMIN");
        this.transpPropria = vo.asString("TRANSPPROPRIA");
        this.exigeNomeParc = vo.asString("EXIGENOMEPARC");
        this.estabTransp = vo.asString("ESTABTRANSP");
        this.dtEmisNfeForn = vo.asTimestamp("DTEMISNFEFORN");
        this.percRedInss = vo.asBigDecimal("PERCREDINSS");
        this.diaPagtoEconect = vo.asBigDecimal("DIAPAGTOECONECT");
        this.diaFechaEconect = vo.asBigDecimal("DIAFECHAECONECT");
        this.integraEconect = vo.asString("INTEGRAECONECT");
        this.baseParceleConect = vo.asBigDecimal("BASEPARCELECONECT");
        this.senhaEconect = vo.asString("SENHAECONECT");
        this.prazoParcEconect = vo.asString("PRAZOPARCECONECT");
        this.parcelaMeConect = vo.asString("PARCELAMECONECT");
        this.perfilEconect = vo.asString("PERFILECONECT");
        this.basePrazoEconect = vo.asBigDecimal("BASEPRAZOECONECT");
        this.tiposParc = vo.asString("TIPOSPARC");
        this.enviaPedEmailTop = vo.asString("ENVIPEDEMAILTOP");
        this.motNaoReterIssqn = vo.asString("MOTNAORETERISSQN");
        this.sitEspecialResp = vo.asString("SITESPECIALRESP");
        this.provAcresc = vo.asBigDecimal("PROVACRESC");
        this.saldoDisp = vo.asBigDecimal("SALDODISP");
        this.tipLotacao = vo.asString("TIPLOTACAO");
        this.chavePix = vo.asString("CHAVEPIX");
        this.desconsideraDescBase = vo.asString("DESCONSIDESCBASE");
        this.codIdentCons = vo.asBigDecimal("CODIDENTCONS");
        this.tipClienteServCom = vo.asBigDecimal("TIPCLIENTESERVCOM");
        this.utilizaNucadParc = vo.asString("UTILIZANUCADPARC");
        this.provAcrescCac = vo.asBigDecimal("PROVACRESCCAC");
        this.saldoDispCac = vo.asBigDecimal("SALDODISPCAC");
        this.atNuVersao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        this.considTotItensTrib = vo.asString("CONSIDTOTITENSTRIB");
        this.deduzIpiBcPisCf = vo.asString("DEDUZIPIBCPISCF");
        this.consParcAdrCst = vo.asString("CONSPARCADRCST");
        this.descontaDescInss = vo.asString("DESCONSDESCINSS");
        this.emailCte = vo.asString("EMAILCTE");
        this.rede = vo.asString("REDE");
        this.grupoPisCofins = vo.asBigDecimal("GRUPOPISCOFINS");
        return this;
   }
}
